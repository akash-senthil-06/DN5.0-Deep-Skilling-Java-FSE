# Exercise 3: Assertions in JUnit

## Objective
To write unit tests using various JUnit 5 assertions (`assertEquals`, `assertTrue`, `assertFalse`, `assertNull`, and `assertNotNull`) to validate conditions.

## Implementation Details
- **AssertionsTest.java**: Performs test assertions on numerical operations, inequalities, and null state validations.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "04-JUnit-Basic/lib/*;." -d . "04-JUnit-Basic/Exercise 3 - Assertions/src/test/java/com/deepskilling/*.java"
   ```
3. Run the tests:
   ```bash
   java -cp "04-JUnit-Basic/lib/*;." com.deepskilling.AssertionsTest
   ```

## Output
```text
Running tests for: com.deepskilling.AssertionsTest
  [PASS] testAssertions
Tests run completed: 1 (Passed: 1, Failed: 0)
```
