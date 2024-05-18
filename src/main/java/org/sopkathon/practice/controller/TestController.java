package org.sopkathon.practice.controller;

import lombok.RequiredArgsConstructor;
import org.sopkathon.practice.service.RememberService;
import org.sopkathon.practice.service.dto.RememberFindDto;
import org.sopkathon.practice.service.dto.TestCreateRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/remember")
public class TestController {
    private final RememberService testService;

    @PostMapping
    public ResponseEntity createTest(
            @ModelAttribute TestCreateRequest testCreateRequest
            ){
        return ResponseEntity.created(URI.create(testService.create(testCreateRequest))).build();
    }

    @GetMapping
    public ResponseEntity<?> getRemember() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(sopt.seminar.sopt.common.dto.SuccessMessage.of(sopt.seminar.sopt.common.dto.response.statusEnum.SuccessStatus.SUCCESS_OK,
                        testService.getRemember()));
    }

    @GetMapping("/all")
    public ResponseEntity<List<RememberFindDto>> getAllRemembers() {
        List<RememberFindDto> rememberList = testService.getAllRemembers();
        return ResponseEntity.status(HttpStatus.OK)
                .body(rememberList);
    }


}
