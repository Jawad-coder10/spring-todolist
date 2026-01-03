package com.djawadi.springtodolist.payload;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoListRequest {
    @NotBlank
    private String title;

    @NotBlank
    private String description;

}
