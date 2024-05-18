package org.sopkathon.practice.controller;

import lombok.RequiredArgsConstructor;
import org.sopkathon.practice.service.TestService;
import org.sopkathon.practice.service.dto.TestCreateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/test")
public class TestController {
    private final TestService testService;

    @PostMapping
    public ResponseEntity createTest(
            @ModelAttribute TestCreateRequest testCreateRequest,
            @RequestParam("file")MultipartFile file
            ){
        return ResponseEntity.created(URI.create(testService.create(testCreateRequest, file))).build();
    }
}
