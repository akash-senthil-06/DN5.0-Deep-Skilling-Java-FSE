# Exercise 1: Implementing the Singleton Pattern

## Objective
To ensure that a logging utility class in your application has only one instance throughout the application lifecycle to ensure consistent logging.

## Implementation Details
- **Logger.java**: Implements a private static instance of itself, a private constructor, and a public static method `getInstance()` to provide global access.
- **SingletonTest.java**: Test class that demonstrates both references point to the same instance by comparing their hash codes.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "01-Design-Patterns/Exercise 1 - Singleton/Logger.java" "01-Design-Patterns/Exercise 1 - Singleton/SingletonTest.java"
   ```
3. Run the application:
   ```bash
   java DesignPatterns.Exercise01.SingletonTest
   ```

## Output
```text
[LOG]: Testing logger instance 1
[LOG]: Testing logger instance 2
Success: Both logger1 and logger2 point to the same instance.
Logger1 HashCode: 2060468723
Logger2 HashCode: 2060468723
```
