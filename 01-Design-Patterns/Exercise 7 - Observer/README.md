# Exercise 7: Implementing the Observer Pattern

## Objective
To develop a stock market monitoring application where multiple clients (mobile app, web app) are notified dynamically whenever stock prices change using the Observer Pattern.

## Implementation Details
- **Observer.java**: Interface containing the `update(String stockName, double price)` callback method.
- **Stock.java**: Subject interface with methods for registering, deregistering, and notifying observers.
- **StockMarket.java**: Concrete subject implementing `Stock` that maintains a collection of registered observers and pushes updates to them upon price change.
- **MobileApp.java**, **WebApp.java**: Concrete observers implementing the `Observer` interface to receive and display stock updates.
- **ObserverTest.java**: Test application registering mobile and web clients, changing prices to test push notifications, deregistering a client, and testing updates again.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "01-Design-Patterns/Exercise 7 - Observer/*.java"
   ```
3. Run the application:
   ```bash
   java DesignPatterns.Exercise07.ObserverTest
   ```

## Output
```text
Updating AAPL stock price to $155.25...
[Mobile App - ClientAlpha] Notification: Stock AAPL price changed to $155.25
[Mobile App - ClientBeta] Notification: Stock AAPL price changed to $155.25
[Web Portal - PortalMain] Notification: Stock AAPL price changed to $155.25

-------------------------------------------
Deregistering ClientBeta (mobile)...

Updating AAPL stock price to $160.00...
[Mobile App - ClientAlpha] Notification: Stock AAPL price changed to $160.0
[Web Portal - PortalMain] Notification: Stock AAPL price changed to $160.0
```
