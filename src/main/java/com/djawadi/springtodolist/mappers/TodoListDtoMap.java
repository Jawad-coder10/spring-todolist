package com.djawadi.springtodolist.mappers;
import com.djawadi.springtodolist.dto.TodoListDto;
import com.djawadi.springtodolist.entities.TodoList;
import org.springframework.stereotype.Component;
@Component
public class TodoListDtoMap {

    public TodoListDto toDto(TodoList todo){
        if(todo == null) return null;
        TodoListDto dto = new TodoListDto();
        dto.setId(todo.getId());
        dto.setTitle(todo.getTitle());
        dto.setDescription(todo.getDescription());
        dto.setCreatedAt(todo.getCreatedAt());
        dto.setUpdatedAt(todo.getUpdatedAt());
        return dto;
    }
}
