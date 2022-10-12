package com.rccl.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rccl.api.entity.Bookings;
import com.rccl.api.respository.BookingRepository;
import com.rccl.api.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	private BookingRepository bookingRepository;
	

	public List<Bookings> findAllBookings() {
		return bookingRepository.findAll();
	}


	@Override
	public Bookings addBooking(Bookings booking) {
		return bookingRepository.save(booking);
	}


	@Override
	public List<Bookings> findAllBookingsByAccountId(String accountId) {
		return bookingRepository.findByAccountId(accountId);
	}


	@Override
	public void deleteBookinByBookingId(String bookingId) {
	bookingRepository.deleteById(bookingId);
	}
	

}
