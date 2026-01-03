package com.djawadi.springtodolist.config;

import com.djawadi.springtodolist.entities.TodoList;
import com.djawadi.springtodolist.repository.TodoListRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final TodoListRepository todoListRepository;

    public DataLoader(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void run(String... args) {

        // Eviter la réinsertion à chaque redémarrage
        if (todoListRepository.count() > 0) {
            return;
        }

        TodoList t1 = TodoList.builder()
                .title("Révision Spring Boot")
                .description("Donnée de test sur la révision de Spring Boot")
                .build();

        TodoList t2 = TodoList.builder()
                .title("Avancer sur Packet Tracer")
                .description("Donnée de test sur l'avancement de Packet Tracer")
                .build();

        todoListRepository.save(t1);
        todoListRepository.save(t2);

        System.out.println("✅ DataLoader exécuté depuis le package config");
    }
}
