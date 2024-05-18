package org.sopkathon.practice.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.sopkathon.practice.domain.Remember;

@Getter
@AllArgsConstructor
public class RememberFindDto {
    private String caption;
    private String imageUrl;

    private static final String BASE_URL = "https://sopkaton-bucket.s3.ap-northeast-2.amazonaws.com/";

    public static RememberFindDto of(Remember remember) {
        return new RememberFindDto(
                remember.getCaption(),
                BASE_URL + remember.getImageUrl()
        );
    }
}

