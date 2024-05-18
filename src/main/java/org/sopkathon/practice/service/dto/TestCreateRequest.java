package org.sopkathon.practice.service.dto;

import org.springframework.web.multipart.MultipartFile;

public record TestCreateRequest(
        String category,
        MultipartFile image,
        String content
) {
}
