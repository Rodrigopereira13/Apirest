package com.rodrigop13.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsuariosSenhaDto {
    
    private String senhaAtual;
    private String novaSenha;
    private String confirmarSenha;
}
