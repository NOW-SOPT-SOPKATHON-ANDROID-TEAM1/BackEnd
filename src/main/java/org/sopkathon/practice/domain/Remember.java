package org.sopkathon.practice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Remember extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageUrl;
    private String caption;


    private Remember(String imageUrl, String caption){
        this.imageUrl = imageUrl;
        this.caption = caption;
    }
    public static Remember create(
            String imageUrl,
            String caption
    ){
        return new Remember(imageUrl, caption);
    }
}
