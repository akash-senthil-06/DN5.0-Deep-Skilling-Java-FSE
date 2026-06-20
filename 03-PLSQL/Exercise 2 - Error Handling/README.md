# Exercise 2: Error Handling

## Objective
To implement robust database transaction error handling using standard PL/SQL Exception Blocks (`EXCEPTION`, `WHEN DUP_VAL_ON_INDEX`, `WHEN NO_DATA_FOUND`, custom exceptions, and transactional rollback routines).

## Stored Procedures
1. **`SafeTransferFunds`**: Performs transactional updates on two accounts. Throws and handles custom `insufficient_funds` or default Oracle exceptions, rolling back actions on failure.
2. **`UpdateSalary`**: Modifies employee salary records by percentage. Gracefully logs missing employee ID errors.
3. **`AddNewCustomer`**: Inserts a new customer record. Safely handles duplicate key constraints (`DUP_VAL_ON_INDEX`).

## SQL Script
- [error_handling.sql](file:///d:/Akash/CTS/DN5.0-Deep-Skilling-Java-FSE/03-PLSQL/Exercise%202%20-%20Error%20Handling/error_handling.sql)

## Mock Output Screenshot
Refer to `Screenshot.png` in this folder representing execution success logs.
