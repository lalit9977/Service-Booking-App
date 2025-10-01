package com.serviceprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceBooking {
	
	private BookingRepository bookingRepository;
	
	@Autowired
	public ServiceBooking(BookingRepository bookingRepository) {
		this.bookingRepository=bookingRepository;
	}
	
	public Booking saveBooking(Booking booking) {
		return bookingRepository.save(booking); 
	}
	

}
