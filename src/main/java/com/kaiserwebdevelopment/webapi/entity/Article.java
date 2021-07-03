package com.kaiserwebdevelopment.webapi.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Please, add heading!")
    private String heading;

    @NotBlank(message = "Please, add opening line!")
    private String openingLine;

    @NotBlank(message = "Please, add thumbnail url!")
    private String thumbnailUrl;
    private int numLike;
}
