package com.djawadi.springtodolist.services;
import com.djawadi.springtodolist.dto.TodoListReqDto;
import com.djawadi.springtodolist.entities.TodoList;
import com.djawadi.springtodolist.payload.TodoListRequest;

import java.util.List;

public interface TodoListServiceImpl {
    List<TodoList> getAllTodoLists(String order);
    TodoList getTodoListById(Long id);
    TodoList updateTodoList(TodoListReqDto todoListReqDto, Long id);
    void deleteTodoList(Long id);
    TodoList register(TodoListRequest todoListRequest);
}
