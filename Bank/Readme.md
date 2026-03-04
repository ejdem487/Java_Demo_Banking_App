# Java Banking Application

Console-based inter-bank application built as a training project
for object-oriented design, design patterns, and interactive CLI development.

## Features
- User registration with input validation
- Login system with user-specific menu
- Bank account management (standard / premium / savings)
- Account number generation
- Deposits, withdrawals, and transfers between accounts

## Architecture & Design Patterns
- **Account** – Factory pattern for account types, Singleton for account number generation
- **Users** – Builder + Director pattern for safe user construction
- **Operations** – Command pattern via `Operation` interface and `OperationInvoker`
- **Bank** – Central service managing users and application lifecycle via `BankConsole`

## Tech Stack
- Java 21
- JUnit 4

## How to Run
1. Clone the repository
2. Open in IntelliJ IDEA
3. Run `BankConsole.java`

