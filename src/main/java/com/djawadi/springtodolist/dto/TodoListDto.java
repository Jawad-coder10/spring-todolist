package com.djawadi.springtodolist.dto;

import lombok.Data;
import java.time.LocalDateTime;
@Data
public class TodoListDto {
    private Long id;
    private String title;
    private String description;
    private String date;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
