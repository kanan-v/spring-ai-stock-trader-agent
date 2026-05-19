package com.kannan.stock_trader_agent.controller;

import com.kannan.stock_trader_agent.service.TradingAgentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TradingController {
    private final TradingAgentService tradingAgentService;

    @GetMapping("/trade")
    public String trade(
            @RequestParam String message
    ) {

        return tradingAgentService.trade(message);
    }
}
