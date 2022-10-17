package com.rccl.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rccl.api.entity.Bookings;
import com.rccl.api.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {

	@Autowired
	BookingService bookingService;

	@GetMapping
	public List<Bookings> getBookings() throws Exception {
		return bookingService.findAllBookings();
	}

	@GetMapping("/find")
	public List<Bookings> getBookingsByAccountId(@RequestParam("bookingId") String bookingId) throws Exception {
		return bookingService.findAllBookingsByAccountId(bookingId);
	}

	@PostMapping
	public Bookings addBooking(@RequestBody Bookings booking) {
		return bookingService.addBooking(booking);
	}

	@DeleteMapping("/find")
	public String deleteBookingsByAccountId(@RequestParam("bookingId") String bookingId) throws Exception {
		bookingService.deleteBookinByBookingId(bookingId);
		return "Deleted";
	}

	@PutMapping("/find")
	public Bookings updateBooking(@RequestParam("bookingId") String bookingId,@RequestBody Bookings booking) throws Exception {
		return bookingService.updateBooking(bookingId,booking);
	}
}
