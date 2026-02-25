// java
package com.djawadi.springtodolist.config;

import com.djawadi.springtodolist.entities.TodoList;
import com.djawadi.springtodolist.repository.TodoListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final TodoListRepository todoListRepository;

    @Override
    public void run(String... args) {
        if (todoListRepository.count() == 0) {
            List<TodoList> todoLists = List.of(
                    TodoList.builder()
                            .title("Révision Spring Boot")
                            .description("Donnée de test sur la révision de Spring Boot")
                            .build(),
                    TodoList.builder()
                            .title("Avancer sur Packet Tracer")
                            .description("Donnée de test sur l'avancement de Packet Tracer")
                            .build()
            );
            todoListRepository.saveAll(todoLists);
        }
    }
}
