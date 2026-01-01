package com.djawadi.springtodolist.services;

import com.djawadi.springtodolist.dto.TodoListReqDto;
import com.djawadi.springtodolist.entities.TodoList;
import com.djawadi.springtodolist.repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TodoListService implements TodoListServiceImpl {
    @Autowired
    private TodoListRepository todoListRepository;
    @Override
    public List<TodoList> getAllTodoLists(String order) {
        if (order != null && order.equalsIgnoreCase("desc")) {
            return todoListRepository.findAllByOrderByIdDesc();
        }
        return todoListRepository.findAll();
    }
    @Override
    public TodoList getTodoListById(Long id) {
        return todoListRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("List non trouvé"));
    }
    @Override
    public TodoList updateTodoList(TodoListReqDto todoListReqDto, Long id) {
        TodoList existingTodoList = todoListRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("List non trouvé"));
        // Mise à jour des champs
        existingTodoList.setTitle(todoListReqDto.getTitle());
        existingTodoList.setDescription(todoListReqDto.getDescription());
        return todoListRepository.save(existingTodoList);
    }
    @Override
    public void deleteTodoList(Long id) {
        TodoList todoList = todoListRepository.findById(id).orElseThrow(() -> new RuntimeException("List non trouvé"));
        todoListRepository.deleteById(todoList.getId());
    }

}
