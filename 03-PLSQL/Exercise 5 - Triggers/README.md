# Exercise 5: Triggers

## Objective
To write row-level database triggers that automatically enforce business rules, update timestamps, and maintain audit trails.

## Triggers
1. **`UpdateCustomerLastModified`**: Fires `BEFORE UPDATE ON Customers` to automatically assign the current system timestamp to `LastModified`.
2. **`LogTransaction`**: Fires `AFTER INSERT ON Transactions` to record transaction activity details into the `AuditLog` table.
3. **`CheckTransactionRules`**: Fires `BEFORE INSERT ON Transactions` to validate that deposits are positive, withdrawals are positive, and withdrawals do not exceed account balances. Raises custom user exceptions (`RAISE_APPLICATION_ERROR`) if checks fail.

## SQL Script
- [triggers.sql](file:///d:/Akash/CTS/DN5.0-Deep-Skilling-Java-FSE/03-PLSQL/Exercise%205%20-%20Triggers/triggers.sql)

## Mock Output Screenshot
Refer to `Screenshot.png` in this folder representing execution success logs.
