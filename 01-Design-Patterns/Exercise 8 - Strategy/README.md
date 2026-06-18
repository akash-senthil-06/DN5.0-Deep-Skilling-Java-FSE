# Exercise 8: Implementing the Strategy Pattern

## Objective
To develop a payment system where different payment methods (e.g., Credit Card, PayPal) can be selected at runtime using the Strategy Pattern.

## Implementation Details
- **PaymentStrategy.java**: Strategy interface defining the execution method `pay(double amount)`.
- **CreditCardPayment.java**, **PayPalPayment.java**: Concrete strategies implementing specific payment options.
- **PaymentContext.java**: Context class that maintains a reference to a `PaymentStrategy` and allows switching strategies dynamically via setter injection.
- **StrategyTest.java**: Test application demonstrating setting different payment strategies at runtime and processing payments.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "01-Design-Patterns/Exercise 8 - Strategy/*.java"
   ```
3. Run the application:
   ```bash
   java DesignPatterns.Exercise08.StrategyTest
   ```

## Output
```text
Processing first transaction...
Paid $250.75 using Credit Card (1234-5678-9012-3456).

-------------------------------------------
Processing second transaction...
Paid $89.99 using PayPal (johndoe@example.com).
```
