package com.coworking.booking.repository;

import com.coworking.booking.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {
    List<Booking> findBySpaceIdAndStartTimeBetween(String spaceId, LocalDateTime start, LocalDateTime end);
}
