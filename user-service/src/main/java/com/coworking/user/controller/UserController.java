package com.coworking.user.controller;

import com.coworking.user.dto.UserLoginRequest;
import com.coworking.user.dto.UserLoginResponse;
import com.coworking.user.dto.UserRegistrationRequest;
import com.coworking.user.dto.UserRegistrationResponse;
import com.coworking.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserRegistrationResponse> register(@RequestBody UserRegistrationRequest request){
        return ResponseEntity.ok(userService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<UserLoginResponse> login(@RequestBody UserLoginRequest request){
        return ResponseEntity.ok(userService.login(request));
    }

}
