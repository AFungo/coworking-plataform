package com.coworking.user.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @JsonIgnore
    private String password;

    public void setId(Long id) {

        if(id == null) {
            throw new IllegalArgumentException("id can't be null");
        }

        this.id = id;
    }

    public Long getId(){return id;}

    public void setName(String name){

        if(name == null){
            throw new IllegalArgumentException("Name can't be null");
        }

        if(name.isBlank()){
            throw new IllegalArgumentException("Name can't be blank");
        }

        this.name = name;
    }

    public String getName(){return name;}

    public void setPassword(String password){
        if(password == null){
            throw new IllegalArgumentException("Password can't be null");
        }
        if(password.isBlank()){
            throw new IllegalArgumentException("Password can't be blank");
        }
        this.password = password;
    }

    public String getPassword(){return password;}
}
