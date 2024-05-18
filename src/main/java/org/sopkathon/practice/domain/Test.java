package org.sopkathon.practice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private String imageUrl;
    private String content;

    private Test(String category, String imageUrl, String content){
        this.category = category;
        this.imageUrl = imageUrl;
        this.content = content;
    }
    public static Test create(
            String category,
            String imageUrl,
            String content
    ){
        return new Test(category, imageUrl, content);
    }
}
