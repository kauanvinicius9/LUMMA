package com.lumma.backend.client;

import com.lumma.backend.config.MenthorConfig;
import com.lumma.backend.dto.request.ChatRequest;
import com.lumma.backend.dto.response.ChatResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class MenthorClient {
    private final RestClient restClient;
    private final MenthorConfig config;

    public String ask(String prompt) {

        ChatResponse response = restClient.post()
            .uri(config.getUrl() + "/chat")
            .body(new ChatRequest(prompt))
            .retrieve()
            .body(ChatResponse.class);
        
        return response != null
            ? response.response()
            : "Nenhuma resposta recebida";
    }
}