# Exercise 1: Mocking and Stubbing

## Objective
To test a service dependency using Mockito to mock interface behaviors and stub method return values.

## Implementation Details
- **ExternalApi.java**: Interface with `getData()` signature.
- **MyService.java**: Service retrieving data from `ExternalApi`.
- **MyServiceTest.java**: Mocks `ExternalApi` using `Mockito.mock` and stubs `getData()` using `when(mock.method()).thenReturn(value)`.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "06-Mockito/lib/*;." -d . "06-Mockito/Exercise 1 - Mocking and Stubbing/src/main/java/com/deepskilling/*.java" "06-Mockito/TestRunner.java" "06-Mockito/Exercise 1 - Mocking and Stubbing/src/test/java/com/deepskilling/*.java"
   ```
3. Run the tests:
   ```bash
   java -cp "06-Mockito/lib/*;." com.deepskilling.MyServiceTest
   ```

## Output
```text
Running Mockito tests for: com.deepskilling.MyServiceTest
  [PASS] testExternalApi
Tests run completed: 1 (Passed: 1, Failed: 0)
```
