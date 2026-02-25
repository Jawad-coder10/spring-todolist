package com.djawadi.springtodolist.controllers;
import com.djawadi.springtodolist.dto.TodoListReqDto;
import com.djawadi.springtodolist.entities.TodoList;
import com.djawadi.springtodolist.services.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
@RestController
@RequestMapping("/api/todolists")
public class TodoListController {
    @Autowired
    private TodoListService todoListService;

    @GetMapping
    public List<TodoList> getAllTodoLists(@RequestParam(value= "order", required = false) String order) {
        return todoListService.getAllTodoLists(order);
    }

    @PostMapping("/create")
    public TodoList createTodoList(@RequestBody TodoListReqDto todoListReqDto)
    {
        return todoListService.createTodoList(todoListReqDto);
    }

    @GetMapping("/{id}")
    public TodoList getTodoListById(@PathVariable Long id) {
        return todoListService.getTodoListById(id);
    }

    @PutMapping("/{id}")
    public TodoList updateTodoList(@PathVariable Long id, @RequestBody TodoListReqDto todoListReqDto) {
        return todoListService.updateTodoList(todoListReqDto, id);
    }
    @DeleteMapping("/{id}")
    public void deleteTodoList(@PathVariable Long id) {
        todoListService.deleteTodoList(id);
    }
}