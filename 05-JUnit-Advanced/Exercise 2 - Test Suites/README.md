# Exercise 2: Test Suites

## Objective
To group multiple related test classes into a test suite and run them together using JUnit 5's `@Suite` and `@SelectClasses` annotations.

## Implementation Details
- **AllTests.java**: Test suite class selecting `EvenCheckerTest.class` (and other test cases) for batch execution.
- **Suite.java, SelectClasses.java**: Local annotations under `org.junit.platform.suite.api` to ensure seamless compilation on systems without suite dependency packages.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "05-JUnit-Advanced/lib/*;." -d . "05-JUnit-Advanced/src/test/java/org/junit/platform/suite/api/*.java" "05-JUnit-Advanced/Exercise 1 - Parameterized Tests/src/main/java/com/deepskilling/EvenChecker.java" "05-JUnit-Advanced/TestRunner.java" "05-JUnit-Advanced/Exercise 1 - Parameterized Tests/src/test/java/com/deepskilling/EvenCheckerTest.java" "05-JUnit-Advanced/Exercise 2 - Test Suites/src/test/java/com/deepskilling/*.java"
   ```
3. Run the suite:
   ```bash
   java -cp "05-JUnit-Advanced/lib/*;." com.deepskilling.AllTests
   ```

## Output
```text
Running Test Suite: com.deepskilling.AllTests
Running advanced tests for: com.deepskilling.EvenCheckerTest
  [PASS] testIsEven with input: 2
  [PASS] testIsEven with input: 4
  [PASS] testIsEven with input: 6
  [PASS] testIsEven with input: 8
  [PASS] testIsEven with input: 10
Tests run completed: 5 (Passed: 5, Failed: 0)
-------------------------------------------
```
