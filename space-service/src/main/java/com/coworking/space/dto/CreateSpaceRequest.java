package com.coworking.space.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateSpaceRequest {
    private String name;
    private String description;
    private int size;
}
