package com.kannan.stock_trader_agent.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class StockTools {

    @Tool(description = "Get stock price for a ticker symbol")
    public double getStockPrice(String ticket){
        System.out.println("Checking stock price for "+ticket);
        Random random = new Random();

        return 100 + random.nextInt(200);
    }

    @Tool(description = "Buy shares of a stock")
    public String buyStock(String ticker, int quantity) {

        System.out.println("Buying stock...");

        return "Bought " + quantity +
                " shares of " + ticker;
    }
}
