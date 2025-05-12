package com.coworking.user.dto;

public class UserLoginResponse {
    private final Long id;
    private String token;

    public UserLoginResponse(long id, String token) {
        this.id = id;
        this.token = token;
    }

    public void setToken(String token) {this.token = token;}
    public String getToken() {return this.token;}
    public Long getId() {return id;}
}
