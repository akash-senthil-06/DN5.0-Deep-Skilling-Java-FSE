# Exercise 5: Timeout Testing

## Objective
To write unit tests verifying that operations resolve within expected durations using JUnit 5's `assertTimeout` assertion.

## Implementation Details
- **PerformanceTester.java**: Simulates latency via a `Thread.sleep(100)` operation.
- **PerformanceTesterTest.java**: Asserts that `performTask` runs in less than 200 milliseconds.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "05-JUnit-Advanced/lib/*;." -d . "05-JUnit-Advanced/Exercise 5 - Timeout Testing/src/main/java/com/deepskilling/PerformanceTester.java" "05-JUnit-Advanced/Exercise 5 - Timeout Testing/src/test/java/com/deepskilling/*.java"
   ```
3. Run the tests:
   ```bash
   java -cp "05-JUnit-Advanced/lib/*;." com.deepskilling.PerformanceTesterTest
   ```

## Output
```text
Running advanced tests for: com.deepskilling.PerformanceTesterTest
  [PASS] testPerformanceTimeout
Tests run completed: 1 (Passed: 1, Failed: 0)
```
