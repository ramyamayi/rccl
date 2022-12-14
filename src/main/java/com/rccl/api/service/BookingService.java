package com.rccl.api.service;

import java.util.List;

import com.rccl.api.entity.Bookings;

public interface BookingService {


	List<Bookings> findAllBookings();

	Bookings addBooking(Bookings booking);

	List<Bookings> findAllBookingsByAccountId(String accountId);

	void deleteBookinByBookingId(String bookingId);

	Bookings updateBooking(String bookingId, Bookings booking) throws Exception;

}
