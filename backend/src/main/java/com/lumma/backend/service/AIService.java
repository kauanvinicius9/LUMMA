package com.lumma.backend.service;

import com.lumma.client.MenthorClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AiService {
    private final MenthorClient menthorClient;

    public String ask(String prompt) {
        return menthorClient.ask(prompt);
    }
}