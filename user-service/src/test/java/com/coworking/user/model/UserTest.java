package com.coworking.user.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testUser(){
        User user = new User();
        String name = "JonDoe";
        Long id = 111L;

        user.setName(name);
        user.setId(id);

        assertEquals(name, user.getName());
        assertEquals(id, user.getId());
    }

}
