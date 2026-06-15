# Exercise 5: Implementing the Decorator Pattern

## Objective
To develop a notification system where notifications can be sent via multiple channels (e.g., Email, SMS, Slack) by adding functionalities dynamically using the Decorator Pattern.

## Implementation Details
- **Notifier.java**: Component interface declaring `send(String message)`.
- **EmailNotifier.java**: Concrete component implementing the base email notification.
- **NotifierDecorator.java**: Abstract decorator class maintaining a reference to a `Notifier` instance and implementing the `Notifier` interface.
- **SMSNotifierDecorator.java**, **SlackNotifierDecorator.java**: Concrete decorators extending `NotifierDecorator` to append SMS and Slack functionalities to the wrapped notifier.
- **DecoratorTest.java**: Test application that demonstrates wrapping notifier objects dynamically at runtime.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "01-Design-Patterns/Exercise 5 - Decorator/*.java"
   ```
3. Run the application:
   ```bash
   java DesignPatterns.Exercise05.DecoratorTest
   ```

## Output
```text
Scenario 1: Sending notification via Email only:
Sending Email notification: System updates completed!

---------------------------------------------
Scenario 2: Sending notification via Email + SMS:
Sending Email notification: Emergency alert: Server down!
Sending SMS notification: Emergency alert: Server down!

---------------------------------------------
Scenario 3: Sending notification via Email + SMS + Slack:
Sending Email notification: Monthly report is ready!
Sending SMS notification: Monthly report is ready!
Sending Slack notification: Monthly report is ready!
```
