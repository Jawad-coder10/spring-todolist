package com.djawadi.springtodolist.mappers;

import com.djawadi.springtodolist.dto.TodoListReqDto;
import com.djawadi.springtodolist.entities.TodoList;
import org.springframework.stereotype.Component;

@Component
public class TodoListReqDtoMap {
    public TodoListReqDto toDto(TodoList todo ){
        TodoListReqDto dto = new TodoListReqDto();
        dto.setTitle(todo.getTitle());
        dto.setDescription(todo.getDescription());
        return dto;
    }
    public TodoList toEntity(TodoListReqDto dto){
        TodoList todo = new TodoList();
        todo.setTitle(dto.getTitle());
        todo.setDescription(dto.getDescription());
        return todo;
    }
}
