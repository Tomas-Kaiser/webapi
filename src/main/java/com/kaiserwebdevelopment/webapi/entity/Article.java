package com.kaiserwebdevelopment.webapi.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private Short id;

    @NotBlank(message = "Please, add heading!")
    @Size(max = 128)
    private String heading;

    @NotBlank(message = "Please, add openning line!")
    @Size(max = 128)
    private String openingLine;

    @Size(max = 128)
    @NotBlank(message = "Please, add thumbnail url!")
    private String thumbnailUrl;
    private Short like;
    private List<comment> comments;
}
