package com.coworking.user.dto;

public class UserLoginRequest {

    private final String name;
    private final String password;

    public UserLoginRequest(String name, String password) {
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
