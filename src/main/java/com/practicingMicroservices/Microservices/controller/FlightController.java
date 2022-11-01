package com.practicingMicroservices.Microservices.controller;

import com.practicingMicroservices.Microservices.model.Flight;
import com.practicingMicroservices.Microservices.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/")
    public Flight saveFlight(@RequestBody Flight flight){
        return flightService.saveFlight(flight);
    }

    @GetMapping("/{id}")
    public Flight findFlightById(@PathVariable("id") Integer flightId){
        return flightService.findFlightById(flightId);
    }


}
