# Exercise 5: Setup & Teardown

## Objective
To understand JUnit test fixtures and execute lifecycle setups and cleanups before/after individual test methods using `@BeforeEach` and `@AfterEach` (or JUnit 4's `@Before` and `@After`).

## Implementation Details
- **ResourceTest.java**: Demonstrates setup initialization outputs before executing test blocks, and teardown cleanups after they resolve.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "04-JUnit-Basic/lib/*;." -d . "04-JUnit-Basic/Exercise 5 - Setup & Teardown/src/test/java/com/deepskilling/*.java"
   ```
3. Run the tests:
   ```bash
   java -cp "04-JUnit-Basic/lib/*;." com.deepskilling.ResourceTest
   ```

## Output
```text
Running tests for: com.deepskilling.ResourceTest
  [SETUP] Initializing test resources...
    Executing Test Case 2
  [PASS] testCase2
  [TEARDOWN] Cleaning up test resources...
  [SETUP] Initializing test resources...
    Executing Test Case 1
  [PASS] testCase1
  [TEARDOWN] Cleaning up test resources...
Tests run completed: 2 (Passed: 2, Failed: 0)
```
