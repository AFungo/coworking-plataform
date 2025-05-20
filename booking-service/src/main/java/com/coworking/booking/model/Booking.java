package com.coworking.booking.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "booking")
public class Booking {
    @Id
    private String id;
    private String userId;
    private String spaceId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
