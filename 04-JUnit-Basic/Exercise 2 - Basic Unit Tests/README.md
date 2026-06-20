# Exercise 2: Writing Basic JUnit Tests

## Objective
To write basic JUnit 5 tests to validate methods inside a simple Java class.

## Implementation Details
- **Calculator.java**: Holds the target business logic (`add` and `subtract` arithmetic methods).
- **CalculatorTest.java**: Implements unit tests asserting expected values match return values. Includes a custom launcher calling `TestRunner`.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "04-JUnit-Basic/lib/*;." -d . "04-JUnit-Basic/Exercise 2 - Basic Unit Tests/src/main/java/com/deepskilling/Calculator.java" "04-JUnit-Basic/Exercise 2 - Basic Unit Tests/src/test/java/com/deepskilling/*.java"
   ```
3. Run the tests:
   ```bash
   java -cp "04-JUnit-Basic/lib/*;." com.deepskilling.CalculatorTest
   ```

## Output
```text
Running tests for: com.deepskilling.CalculatorTest
  [PASS] testSubtract
  [PASS] testAdd
Tests run completed: 2 (Passed: 2, Failed: 0)
```
