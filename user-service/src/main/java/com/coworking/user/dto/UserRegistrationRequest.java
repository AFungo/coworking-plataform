package com.coworking.user.dto;

public class UserRegistrationRequest {
    private final String name;
    private final String password;
    
    public UserRegistrationRequest(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    
    public String getPassword() {
        return password;
    }
}
