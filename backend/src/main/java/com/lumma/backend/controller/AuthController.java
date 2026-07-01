package com.lumma.backend.controller;

import com.lumma.backend.dto.LoginRequest;
import com.lumma.backend.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController;
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(
                    @RequestBody LoginRequest request) {

            return authService.login(request)
        }
}
