package com.rodrigop13.web.dto;

import lombok.*;

@NoArgsConstructor
@ToString
@Setter
@AllArgsConstructor
@Getter
public class UsuariosResponseDtop {

    private Long id;
    private String username;
    private String role;
}
