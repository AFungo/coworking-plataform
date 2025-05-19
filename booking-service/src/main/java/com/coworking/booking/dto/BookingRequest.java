package com.coworking.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequest {
    private String userId;
    private String spaceId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
