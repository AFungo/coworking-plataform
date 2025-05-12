package com.coworking.user.dto;

public class UserRegistrationResponse {
    private final Long id;

    public UserRegistrationResponse(long id) {
        this.id = id;
    }

    public Long getId() {return id;}
}
