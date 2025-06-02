package com.coworking.space.controller;

import com.coworking.space.dto.CreateSpaceRequest;
import com.coworking.space.dto.CreateSpaceResponse;
import com.coworking.space.model.Space;
import com.coworking.space.service.SpaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/space")
@RequiredArgsConstructor
public class SpaceController {

    private final SpaceService spaceService;

    @PostMapping("/create-space")
    public CreateSpaceResponse createSpace(@RequestBody CreateSpaceRequest space) {
        return spaceService.createSpace(space);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Space> getSpace(@PathVariable long id) {
        return spaceService.getSpace(id);
    }

}
