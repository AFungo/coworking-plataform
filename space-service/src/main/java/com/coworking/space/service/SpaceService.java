package com.coworking.space.service;

import com.coworking.space.dto.CreateSpaceRequest;
import com.coworking.space.dto.CreateSpaceResponse;
import com.coworking.space.model.Space;
import com.coworking.space.repository.SpaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpaceService {

    private final SpaceRepository spaceRepository;

    public CreateSpaceResponse createSpace(CreateSpaceRequest createSpaceRequest) {

        String name = createSpaceRequest.getName();
        String description  = createSpaceRequest.getDescription();

        if (name == null || description == null) {
            throw new IllegalArgumentException("Name and description cannot be null");
        }

        int size = createSpaceRequest.getSize();
        if(size < 1) {
            throw new IllegalArgumentException("Size cannot be less than 1");
        }
        Space space = new Space();
        space.setName(name);
        space.setDescription(description);
        space.setSize(size);
        space = spaceRepository.save(space);

        return new CreateSpaceResponse(space.getId());
    }

    public ResponseEntity<Space> getSpace(long id) {
        return spaceRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
