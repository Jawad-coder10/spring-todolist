package com.djawadi.springtodolist.dto;

import lombok.Data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Data
public class TodoListDto {
    private Long id;
    private String title;
    private String description;
    private String date;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    /* Lombok propose les getters et setters pour LocalDateTime mais il ne crée pas un surcharge avec Instant,
    C'est pour ça qu'on va faire appel au notion de surcharge des methodes.*/
    public void setCreatedAt(Instant instant) {
        this.createdAt = (instant == null) ? null : LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }

    // surcharge : accepte Instant et convertit en LocalDateTime
    public void setUpdatedAt(Instant instant) {
        this.updatedAt = (instant == null) ? null : LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }
}
