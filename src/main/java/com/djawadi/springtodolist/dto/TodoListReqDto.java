package com.djawadi.springtodolist.dto;
import lombok.Data;
import java.time.LocalDateTime;
@Data
public class TodoListReqDto {
    private String title;
    private String description;
    private String date;

}
