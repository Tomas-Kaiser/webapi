package com.kaiserwebdevelopment.webapi.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Short id;
    @NotBlank(message = "Add your name (author name) of the comment!")
    private String author;

    @NotBlank(message = "Add text of your comment!")
    private String text;
    private Date date;

    public comment(Date date) {
        this.date = new Date();
    }
}
