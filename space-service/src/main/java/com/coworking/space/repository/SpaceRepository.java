package com.coworking.space.repository;

import com.coworking.space.model.Space;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpaceRepository  extends JpaRepository<Space, Long> {
    Optional<Space> findById(long id);
}
