package org.sopkathon.practice.service.dto;

import org.springframework.web.multipart.MultipartFile;

public record TestCreateRequest(
        MultipartFile image,
        String caption
) {
}
