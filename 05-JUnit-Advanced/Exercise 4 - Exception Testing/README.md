# Exercise 4: Exception Testing

## Objective
To write unit tests checking that specific methods correctly throw expected exceptions using JUnit 5's `assertThrows` assertion.

## Implementation Details
- **ExceptionThrower.java**: Holds logic checking parameters and throwing `IllegalArgumentException` on null values.
- **ExceptionThrowerTest.java**: Asserts that calling the thrower method with a null parameter properly triggers an `IllegalArgumentException` using a lambda expression.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "05-JUnit-Advanced/lib/*;." -d . "05-JUnit-Advanced/Exercise 4 - Exception Testing/src/main/java/com/deepskilling/ExceptionThrower.java" "05-JUnit-Advanced/Exercise 4 - Exception Testing/src/test/java/com/deepskilling/*.java"
   ```
3. Run the tests:
   ```bash
   java -cp "05-JUnit-Advanced/lib/*;." com.deepskilling.ExceptionThrowerTest
   ```

## Output
```text
Running advanced tests for: com.deepskilling.ExceptionThrowerTest
  [PASS] testThrowException
Tests run completed: 1 (Passed: 1, Failed: 0)
```
