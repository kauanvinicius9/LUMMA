package com.lumma.backend.controller;

import com.lumma.backend.dto.request.ChatRequest;
import com.lumma.backend.service.AIService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor
public class ChatController {

    private final AIService aiService;

    @PostMapping
    public String chat(@RequestBody ChatRequest request) {

        return aiService.ask(
                request.message()
        );
    }
}