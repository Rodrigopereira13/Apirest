package com.rodrigop13.web.controller;

import com.rodrigop13.web.dto.UsuariosCreateDto;
import com.rodrigop13.web.dto.UsuariosResponseDtop;
import com.rodrigop13.web.dto.UsuariosSenhaDto;
import com.rodrigop13.web.dto.mapper.UsuariosMapper;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import com.rodrigop13.entity.Usuarios;
import com.rodrigop13.service.UserService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@RequiredArgsConstructor //injeta as dependencias no caso autowired de userservice
@RestController
@RequestMapping("apiteste/v1/users")
public class UserController {
    
    private final UserService userService;


    @PostMapping
    public ResponseEntity<UsuariosResponseDtop> create(@Valid @RequestBody UsuariosCreateDto createDto) {
        Usuarios user = userService.salvar(UsuariosMapper.toUsuario(createDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(UsuariosMapper.toDto(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuariosResponseDtop> getByid(@PathVariable Long id) { //pega o valor e coloca na variavel long
        Usuarios usuario = userService.buscarPorId(id);
        return ResponseEntity.ok(UsuariosMapper.toDto(usuario));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> updatePassword(@PathVariable Long id,@Valid @RequestBody UsuariosSenhaDto dto) {
        Usuarios usuario = userService.editarSenha(id, dto.getSenhaAtual(), dto.getNovaSenha(), dto.getConfirmarSenha());
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<UsuariosResponseDtop>> getAll(){
        List<Usuarios> usuarios = userService.buscarTodos();
        return ResponseEntity.ok(UsuariosMapper.toListDto(usuarios));
    }
}

