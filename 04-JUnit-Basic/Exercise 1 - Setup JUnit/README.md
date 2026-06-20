# Exercise 1: Setting Up JUnit

## Objective
To set up JUnit 5 (JUnit Jupiter) dependencies and write a validation test indicating that the test framework is successfully linked.

## Setup Details
- **pom.xml**: Configures Maven dependencies for JUnit Jupiter and compiler plugins.
- **AppTest.java**: Test class importing JUnit 5 libraries and running a basic validation test.

## How to Run (Using custom offline classpath)
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "04-JUnit-Basic/lib/*;." -d . "04-JUnit-Basic/Exercise 1 - Setup JUnit/src/test/java/com/deepskilling/*.java"
   ```
3. Run the validation test:
   ```bash
   java -cp "04-JUnit-Basic/lib/*;." com.deepskilling.AppTest
   ```

## Output
```text
Running tests for: com.deepskilling.AppTest
JUnit 5 setup is working correctly!
  [PASS] testSetup
Tests run completed: 1 (Passed: 1, Failed: 0)
```
