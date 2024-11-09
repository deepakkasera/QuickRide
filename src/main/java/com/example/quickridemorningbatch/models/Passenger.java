package com.example.quickridemorningbatch.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Passenger extends User {
    @ManyToMany(mappedBy = "passengers")
    private List<Ride> rides;
}


/*

   1               M
Passenger ------- Ride => M:M
  M                1

 */
