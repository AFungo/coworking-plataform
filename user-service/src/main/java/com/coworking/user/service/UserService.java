package com.coworking.user.service;

import com.coworking.user.dto.UserLoginRequest;
import com.coworking.user.dto.UserLoginResponse;
import com.coworking.user.dto.UserRegistrationRequest;
import com.coworking.user.dto.UserRegistrationResponse;
import com.coworking.user.model.User;
import com.coworking.user.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
//        this.passwordEncoder = new SecurityConfig().passwordEncoder();
    }

    public UserRegistrationResponse register(UserRegistrationRequest userRegistrationRequest) {
        String name = userRegistrationRequest.getName();
        
        if(userRepository.findByName(name).isPresent()) {
            throw new IllegalArgumentException("Duplicated username");
        }
        
//        String hashedPassword = passwordEncoder.encode(userRegistrationRequest.getPassword());
        
        User user = new User();
        user.setName(name);
        user.setPassword(userRegistrationRequest.getPassword());
        user = userRepository.save(user);

        return new UserRegistrationResponse(user.getId());
    }

//    public UserLoginResponse login(UserLoginRequest userLoginRequest) {
//
//    }
}
