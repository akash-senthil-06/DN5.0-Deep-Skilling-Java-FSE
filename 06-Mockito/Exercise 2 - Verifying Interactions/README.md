# Exercise 2: Verifying Interactions

## Objective
To ensure that dependencies are correctly invoked under test by verifying mock object method interactions.

## Implementation Details
- **ExternalApi.java**: Interface with dependencies.
- **MyService.java**: Dependent service.
- **MyServiceVerifyTest.java**: Executes `service.fetchData()` and uses Mockito's `verify(mock).getData()` to assert the call resolved.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "06-Mockito/lib/*;." -d . "06-Mockito/Exercise 2 - Verifying Interactions/src/main/java/com/deepskilling/*.java" "06-Mockito/Exercise 2 - Verifying Interactions/src/test/java/com/deepskilling/*.java"
   ```
3. Run the tests:
   ```bash
   java -cp "06-Mockito/lib/*;." com.deepskilling.MyServiceVerifyTest
   ```

## Output
```text
Running Mockito tests for: com.deepskilling.MyServiceVerifyTest
  [PASS] testVerifyInteraction
Tests run completed: 1 (Passed: 1, Failed: 0)
```
