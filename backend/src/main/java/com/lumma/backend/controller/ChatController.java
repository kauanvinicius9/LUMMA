package com.lumma.backend.controller;

import com.lumma.dto.ChatRequest;
import com.lumma.service.AiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor
public class ChatController {

    private final AiService aiService;

    @PostMapping
    public String chat(@RequestBody ChatRequest request) {

        return aiService.ask(
                request.message()
        );
    }
}