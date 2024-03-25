package com.rodrigop13.web.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuariosCreateDto {

    private String username;
    private String password;
}
