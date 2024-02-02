package com.rodrigop13.controller;

import org.springframework.web.bind.annotation.RestController;

import com.rodrigop13.entity.User;
import com.rodrigop13.service.UserService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RequiredArgsConstructor //injeta as dependencias no caso autowired de userservice
@RestController
@RequestMapping("api/v1/users")
public class UserController {
    
    private final UserService userService;


    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user){  //encapsula o objeto user e depois enviado para o cliente
        User usuario = userService.salvar(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }
}
