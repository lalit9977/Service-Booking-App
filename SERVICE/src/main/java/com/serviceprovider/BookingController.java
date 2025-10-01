package com.serviceprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")
public class BookingController {

	
	private ServiceBooking serviceBooking;
	
	@Autowired
	public BookingController (ServiceBooking serviceBooking) {
		this.serviceBooking = serviceBooking;
	}
	
	@PostMapping
	public Booking saveBooking(@RequestBody Booking booking) {
		
		return serviceBooking.saveBooking(booking);
	}
}
