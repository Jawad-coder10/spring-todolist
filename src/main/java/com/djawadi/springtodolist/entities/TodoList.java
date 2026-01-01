package com.djawadi.springtodolist.entities;
import lombok.Data;

@Data
public class TodoList {
    private Long id;
    private String title;
    private String description;
    private String date;

    public  TodoList(Long id, String title, String description, String date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
    }

}
