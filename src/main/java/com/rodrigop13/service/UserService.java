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

    @Transactional //sping vai cuidar como abrir, gerenciar e fechar a transaçao do metodo save
    public User salvar(User user) {
        return userRepository.save(user);
    }

    @Transactional(readOnly = true) //metodo exclusivo para consulta no banco de dados
    public User buscarPorId(Long id) {
        return userRepository.findById(id).orElseThrow(
            () -> new RuntimeException("Usuário não encontrado.")
        );
    }
}
