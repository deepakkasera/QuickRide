package com.example.quickridemorningbatch.repositories;

import com.example.quickridemorningbatch.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    @Override
    Optional<Vehicle> findById(Long aLong);
}
