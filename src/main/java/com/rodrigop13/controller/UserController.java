package com.rodrigop13.controller;

import org.springframework.web.bind.annotation.RestController;

import com.rodrigop13.service.UserService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;


@RequiredArgsConstructor //injeta as dependencias no caso autowired de userservice
@RestController
@RequestMapping("api/v1/usuarios")

public class UserController {
    
    private final UserService userService;
}
