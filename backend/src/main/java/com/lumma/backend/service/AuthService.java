package com.lumma.backend.service;

import com.lumma.backend.dto.LoginRequest;
import com.lumma.backend.entity.User;
import com.lumma.backend.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public ResponseEntity<?> login(LoginRequest request) {
        User user=repository.findByEmail(request.email())
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        if (!passwordEncoder.matches(request.password(), user.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body("Senha inválida")
        }

        return ResponseEntity.ok("Login realizado");
    }
}