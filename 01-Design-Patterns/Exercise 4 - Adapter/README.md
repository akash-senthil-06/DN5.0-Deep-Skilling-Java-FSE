# Exercise 4: Implementing the Adapter Pattern

## Objective
To develop a payment processing system that integrates with multiple third-party payment gateways with different interfaces using the Adapter Pattern.

## Implementation Details
- **PaymentProcessor.java**: The target interface that the client code uses. Defines the `processPayment(double amount)` method.
- **GPay.java**, **PhonePe.java**: The adaptee classes with gateway-specific interfaces (`makePayment` and `doTransaction` respectively).
- **GPayAdapter.java**, **PhonePeAdapter.java**: Adapter classes implementing `PaymentProcessor` and wrapping instances of the respective adaptees. They translate the target interface call into the adaptee's specific call.
- **AdapterTest.java**: Demonstrates clients interacting with various payment processors uniformly through the target interface.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "01-Design-Patterns/Exercise 4 - Adapter/*.java"
   ```
3. Run the application:
   ```bash
   java DesignPatterns.Exercise04.AdapterTest
   ```

## Output
```text
Processing payments via unified PaymentProcessor interface:
Processing payment of $150.0 through Google Pay.
Processing transaction of $275.5 through PhonePe.
```
