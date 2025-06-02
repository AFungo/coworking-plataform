package com.coworking.space.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "space")
@Getter
@Setter
public class Space {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int size;

    @Column(unique = true)
    private String name;

    private String description;

}
