package com.djawadi.springtodolist.mappers;

import com.djawadi.springtodolist.dto.TodoListDto;
import com.djawadi.springtodolist.entities.TodoList;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Component
public class TodoListDtoMap {

    public TodoListDto toDto(TodoList todo){
        if(todo == null) return null;

        TodoListDto dto = new TodoListDto();
        dto.setId(todo.getId());
        dto.setTitle(todo.getTitle());
        dto.setDescription(todo.getDescription());

        // Convert createdAt and updatedAt from Instant to LocalDateTime
        if (todo.getCreatedAt() != null) {
            dto.setCreatedAt(LocalDateTime.ofInstant(todo.getCreatedAt(), ZoneId.systemDefault()));
        } else {
            dto.setCreatedAt(null);
        }

        if (todo.getUpdatedAt() != null) {
            dto.setUpdatedAt(LocalDateTime.ofInstant(todo.getUpdatedAt(), ZoneId.systemDefault()));
        } else {
            dto.setUpdatedAt(null);
        }return dto;
    }
}
