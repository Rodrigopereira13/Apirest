package com.rodrigop13.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rodrigop13.entity.Usuarios;
import com.rodrigop13.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
    
    private final UserRepository userRepository;

    @Transactional //sping vai cuidar como abrir, gerenciar e fechar a transaçao do metodo save
    public Usuarios salvar(Usuarios usuarios) {

        return userRepository.save(usuarios);
    }

    @Transactional(readOnly = true) //metodo exclusivo para consulta no banco de dados, só leitura
    public Usuarios buscarPorId(Long id) {
        return userRepository.findById(id).orElseThrow(
            () -> new RuntimeException("Usuário não encontrado.")
        );
    }

    @Transactional 
    public Usuarios editarSenha(Long id, String password) {
        Usuarios usuarios = buscarPorId(id);
        usuarios.setPassword(password);
        return usuarios;
    }

    @Transactional(readOnly = true)
    public List<Usuarios> buscarTodos() {

        return userRepository.findAll();
    }
}
