package com.example.quickridemorningbatch.services;

import com.example.quickridemorningbatch.models.Ride;
import org.springframework.stereotype.Service;

@Service
public class RideService {
    public Ride proposeRide(String source,
                            String destination,
                            Long driverId,
                            Long vehicleId,
                            int availableSeatCount) {
        return new Ride();
    }
}
