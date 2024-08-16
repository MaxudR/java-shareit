package ru.practicum.shareit.user.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @Null(groups = MarkerUserDto.OnCreate.class)
    private Long id;

    @NotBlank(groups = MarkerUserDto.OnCreate.class)
    private String name;

    @NotBlank(groups = MarkerUserDto.OnCreate.class)
    @Email(groups = MarkerUserDto.OnCreate.class, message = "Неправильный формат электронной почты")
    @Email(groups = MarkerUserDto.OnUpdate.class, message = "Неправильный формат электронной почты")
    private String email;
}
