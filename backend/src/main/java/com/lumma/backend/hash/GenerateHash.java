package com.lumma.backend.hash;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GenerateHash {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();

        System.out.println(encoder.encode("12345"));
        System.out.println(encoder.encode("admin"));
        // O hash do adm é só colocar insert do adm
        // Colocar no insert onde está NULL, senha virá no console
    }
}