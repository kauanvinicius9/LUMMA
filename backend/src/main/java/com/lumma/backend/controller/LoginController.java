package com.lumma.backend.controller;

@RestController
@PostMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService
}


public ResponseEntity<?> login(@RequestBody LoginRequest request) {
    return authService.login(request);

    User user = repository.findByEmail(request.email())
        .orElseThrow();

    if (passwordEncoder.matches(request.password(), user.getPassword())) {
        return ResponseEntity.ok("Login realizado");
    }

    return ResponseEntity.status(401).body("Senha inválida");
}