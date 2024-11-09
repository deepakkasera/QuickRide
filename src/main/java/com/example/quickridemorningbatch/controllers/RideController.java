package com.example.quickridemorningbatch.controllers;

import com.example.quickridemorningbatch.dtos.ProposeRideRequestDto;
import com.example.quickridemorningbatch.dtos.ProposeRideResponseDto;
import com.example.quickridemorningbatch.models.Ride;
import com.example.quickridemorningbatch.services.RideService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rides")
public class RideController {
    private RideService rideService;

    public RideController(RideService rideService) {
        this.rideService = rideService;
    }

    public ProposeRideResponseDto proposeRide(ProposeRideRequestDto requestDto) {

        Ride ride = rideService.proposeRide(
                requestDto.getSource(),
                requestDto.getDestination(),
                requestDto.getDriverId(),
                requestDto.getVehicleId(),
                requestDto.getAvailableSeatCount()
        );

        return null;
    }
}
