package com.rodrigop13.service;

import org.springframework.stereotype.Service;

import com.rodrigop13.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
    
    private final UserRepository userRepository;
}
