# Exercise 1: Parameterized Tests

## Objective
To test a method against a range of inputs using JUnit 5's `@ParameterizedTest` and `@ValueSource` annotations.

## Implementation Details
- **EvenChecker.java**: Contains a simple business logic method `isEven(int number)`.
- **EvenCheckerTest.java**: Test runner utilizing `@ParameterizedTest` and `@ValueSource` passing inputs `{2, 4, 6, 8, 10}` to check correctness.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "05-JUnit-Advanced/lib/*;." -d . "05-JUnit-Advanced/Exercise 1 - Parameterized Tests/src/main/java/com/deepskilling/EvenChecker.java" "05-JUnit-Advanced/TestRunner.java" "05-JUnit-Advanced/Exercise 1 - Parameterized Tests/src/test/java/com/deepskilling/*.java"
   ```
3. Run the tests:
   ```bash
   java -cp "05-JUnit-Advanced/lib/*;." com.deepskilling.EvenCheckerTest
   ```

## Output
```text
Running advanced tests for: com.deepskilling.EvenCheckerTest
  [PASS] testIsEven with input: 2
  [PASS] testIsEven with input: 4
  [PASS] testIsEven with input: 6
  [PASS] testIsEven with input: 8
  [PASS] testIsEven with input: 10
Tests run completed: 5 (Passed: 5, Failed: 0)
```
