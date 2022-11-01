package com.practicingMicroservices.Microservices.service;

import com.practicingMicroservices.Microservices.model.Booking;
import com.practicingMicroservices.Microservices.model.Flight;
import com.practicingMicroservices.Microservices.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepo bookingRepo;

    public Booking saveBooking(Booking booking) {
        return bookingRepo.save(booking);
    }

    public Booking findBookingById(Integer bookingId) {
        return bookingRepo.findByBookingId(bookingId);
    }



}
