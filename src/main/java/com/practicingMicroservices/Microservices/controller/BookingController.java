package com.practicingMicroservices.Microservices.controller;

import com.practicingMicroservices.Microservices.model.Booking;
import com.practicingMicroservices.Microservices.model.Flight;
import com.practicingMicroservices.Microservices.service.BookingService;
import com.practicingMicroservices.Microservices.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/")
    public Booking saveBooking(@RequestBody Booking booking){
        return bookingService.saveBooking(booking);
    }

    @GetMapping("/{id}")
    public Booking findBookingById(@PathVariable("id") Integer bookingId){
        return bookingService.findBookingById(bookingId);
    }
}
