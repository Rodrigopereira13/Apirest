package com.rodrigop13.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rodrigop13.entity.User;
import com.rodrigop13.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
    
    private final UserRepository userRepository;

    @Transactional
    public User salvar(User user) {
        return userRepository.save(user);
    }
}
