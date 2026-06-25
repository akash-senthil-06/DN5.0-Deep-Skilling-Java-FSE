# Exercise 3: Test Execution Order

## Objective
To control and predict the order in which tests are executed using JUnit 5's `@TestMethodOrder` and `@Order` annotations.

## Implementation Details
- **OrderedTests.java**: Configures `@TestMethodOrder(MethodOrderer.OrderAnnotation.class)` and orders three test cases sequentially from `1` to `3`.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "05-JUnit-Advanced/lib/*;." -d . "05-JUnit-Advanced/Exercise 3 - Test Execution Order/src/test/java/com/deepskilling/*.java"
   ```
3. Run the tests:
   ```bash
   java -cp "05-JUnit-Advanced/lib/*;." com.deepskilling.OrderedTests
   ```

## Output
```text
Running advanced tests for: com.deepskilling.OrderedTests
    Executing first test (Order = 1)
  [PASS] testFirst
    Executing second test (Order = 2)
  [PASS] testSecond
    Executing third test (Order = 3)
  [PASS] testThird
Tests run completed: 3 (Passed: 3, Failed: 0)
```
