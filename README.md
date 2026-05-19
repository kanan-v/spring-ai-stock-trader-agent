# spring-ai-stock-trader-agent 📈🤖

AI-powered stock trading agent built using Spring AI and Ollama.

This project demonstrates autonomous AI agent behavior using tool calling/function calling, where the LLM can:
- check stock prices
- make decisions
- execute stock purchases

without explicit hardcoded business logic.

---

# 🚀 Features

- AI Agent architecture
- Tool calling / function calling
- Autonomous decision making
- Multi-step reasoning
- Stock price checking tool
- Stock purchase tool
- Local LLM using Ollama
- Spring AI integration

---

# 🧠 How It Works

The application exposes tools to the LLM using:

```java
@Tool
```

The AI agent autonomously:
1. Understands the user's goal
2. Chooses which tool to call
3. Executes tools
4. Evaluates tool results
5. Decides next action
6. Generates final response

---

# 🔄 Agent Flow

```text
User Prompt
     ↓
LLM Reasoning
     ↓
Tool Selection
     ↓
getStockPrice()
     ↓
LLM Decision
     ↓
buyStock()
     ↓
Final AI Response
```

---

# 🛠️ Tech Stack

- Java 21
- Spring Boot
- Spring AI
- Ollama
- Maven
- Lombok

---

# 📂 Project Structure

```text
src/main/java/com/kannan/stock_trader_agent
│
├── controller
│   └── TradingController.java
│
├── service
│   ├── TradingAgentService.java
│   └── StockTools.java
│
└── StockTraderAgentApplication.java
```

---

# ⚙️ Setup Instructions

## 1️⃣ Clone Repository

```bash
git clone https://github.com/kanan-v/stock-trader-agent.git
cd stock-trader-agent
```

---

## 2️⃣ Install Ollama

Download:

https://ollama.com/

---

## 3️⃣ Start Ollama

```bash
ollama serve
```

---

## 4️⃣ Pull Tool-Supported Model

```bash
ollama pull qwen2.5
```

---

## 5️⃣ Configure Application

`application.yaml`

```yaml
spring:
  application:
    name: stock-trader-agent

  ai:
    ollama:
      base-url: http://localhost:11434

      chat:
        model: qwen2.5

logging:
  level:
    org.springframework.ai: DEBUG
```

---

## 6️⃣ Run Application

```bash
./mvnw spring-boot:run
```

---

# 🎯 Example API

## Request

```http
GET /trade?message=If Apple is under $200, buy me 10 shares
```

---

# 🤖 Expected Agent Behavior

The LLM autonomously:
1. Calls `getStockPrice("AAPL")`
2. Checks returned value
3. Decides whether to buy
4. Calls `buyStock()`
5. Generates final response

---

# ✅ Example Response

```text
I checked the stock price of Apple.
It was $150, so I bought 10 shares for you.
```

---

# 🔍 Example Tool Logs

```text
Checking stock price for AAPL
Buying stock...
```

---

# 📊 Concepts Demonstrated

- AI Agents
- Tool Calling
- Function Calling
- Autonomous Decision Making
- Multi-Step Reasoning
- LLM Tool Orchestration
- Spring AI Tool Integration
- Agentic AI

---

# 🧪 Future Improvements

- Real stock market APIs
- Portfolio tracking
- Multi-stock trading
- Risk analysis
- Persistent trade history
- Web UI dashboard
- AI investment advisor

---

# 👨‍💻 Author

Kannan V

---

# ⭐ If you found this useful

Give this repository a star ⭐
