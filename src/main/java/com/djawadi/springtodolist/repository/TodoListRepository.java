// src/main/java/com/djawadi/repository/TodoListRepository.java
package com.djawadi.springtodolist.repository;

import com.djawadi.springtodolist.entities.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoListRepository extends JpaRepository<TodoList, Long> {

    List<TodoList> findAllByOrderByIdDesc();
    Boolean existsByTitle(String username);
}
