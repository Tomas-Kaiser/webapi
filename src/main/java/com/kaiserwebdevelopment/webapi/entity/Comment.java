package com.kaiserwebdevelopment.webapi.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Add your name (author name) of the Comment!")
    private String author;

    @NotBlank(message = "Add text of your Comment!")
    private String text;

    @Temporal(TemporalType.DATE)
    private Calendar date;

}
