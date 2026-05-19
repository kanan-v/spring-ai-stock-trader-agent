package com.kannan.stock_trader_agent.service;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TradingAgentService {

    private final ChatClient.Builder chatClientBuilder;
    private final StockTools stockTools;

    public String trade(String message) {

        return chatClientBuilder.build()
                .prompt()
                .user(message)

                .tools(stockTools)

                .call()
                .content();
    }
}