package com.example.quickridemorningbatch.repositories;

import com.example.quickridemorningbatch.models.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RideRepository extends JpaRepository<Ride, Long> {
    @Override
    Optional<Ride> findById(Long aLong);

    @Override
    Ride save(Ride ride);
    //upsert => update + insert
}
