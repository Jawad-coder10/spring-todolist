package com.djawadi.springtodolist.dto;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoListReqDto {

    @NotBlank
    @Size(max = 20)
    @Column(unique = true)
    private String title;

    @NotBlank
    @Size(max = 100)
    private String description;

}
