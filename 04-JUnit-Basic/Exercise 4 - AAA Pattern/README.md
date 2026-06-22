# Exercise 4: Arrange-Act-Assert (AAA) Pattern

## Objective
To write well-structured unit tests conforming to the standard **Arrange-Act-Assert (AAA)** structural convention:
1. **Arrange**: Set up test preconditions and inputs (e.g. instantiating class with values).
2. **Act**: Perform the operation/invoke the method under test.
3. **Assert**: Compare the actual result with the expected condition.

## Implementation Details
- **BankAccount.java**: Models a checking/savings account balance.
- **BankAccountTest.java**: Unit tests targeting deposits and withdrawals using explicit `Arrange`, `Act`, and `Assert` steps.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "04-JUnit-Basic/lib/*;." -d . "04-JUnit-Basic/Exercise 4 - AAA Pattern/src/main/java/com/deepskilling/BankAccount.java" "04-JUnit-Basic/Exercise 4 - AAA Pattern/src/test/java/com/deepskilling/*.java"
   ```
3. Run the tests:
   ```bash
   java -cp "04-JUnit-Basic/lib/*;." com.deepskilling.BankAccountTest
   ```

## Output
```text
Running tests for: com.deepskilling.BankAccountTest
  [PASS] testWithdrawInsufficientFunds
  [PASS] testDeposit
  [PASS] testWithdrawSuccess
Tests run completed: 3 (Passed: 3, Failed: 0)
```
