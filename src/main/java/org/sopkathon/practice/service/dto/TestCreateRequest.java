package org.sopkathon.practice.service.dto;

public record TestCreateRequest(
        String category,
        //MultipartFile image,
        String content
) {
}
