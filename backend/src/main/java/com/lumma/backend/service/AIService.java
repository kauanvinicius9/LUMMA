package com.lumma.backend.service;

import com.lumma.backend.client.MenthorClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AIService {
    private final MenthorClient menthorClient;

    public String ask(String prompt) {
        return menthorClient.ask(prompt);
    }
}