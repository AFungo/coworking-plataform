package com.coworking.user.reposirtory;

import com.coworking.user.model.User;
import com.coworking.user.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testRegisterUser() {

        User user = new User();
        user.setName("JonDoe");

        User saved = userRepository.save(user);

        Assertions.assertNotNull(saved.getId());

        Optional<User> fetched = userRepository.findById(saved.getId());
        Assertions.assertTrue(fetched.isPresent());
        Assertions.assertEquals("JonDoe", fetched.get().getName());
    }
}
