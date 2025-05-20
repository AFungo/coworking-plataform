package com.coworking.booking.service;

import com.coworking.booking.dto.BookingRequest;
import com.coworking.booking.dto.BookingResponse;
import com.coworking.booking.model.Booking;
import com.coworking.booking.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingResponse createBooking(BookingRequest bookingRequest) {
        Booking booking = new Booking();
        booking.setUserId(bookingRequest.getUserId());
        booking.setSpaceId(bookingRequest.getSpaceId());
        booking.setStartTime(bookingRequest.getStartTime());
        booking.setEndTime(bookingRequest.getEndTime());

        booking = bookingRepository.save(booking);

        return new BookingResponse(booking.getId());
    }

    public ResponseEntity<Booking> getBooking(String bookingId) {
        Booking booking = bookingRepository.findById(bookingId).orElse(null);

        if( booking == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(booking);
    }
}