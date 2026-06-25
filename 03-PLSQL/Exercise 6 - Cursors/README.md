# Exercise 6: Cursors

## Objective
To write PL/SQL blocks using explicit cursors (`CURSOR`, `FOR LOOP` records, and `CURRENT OF` updates) for batch data modifications and statement generation.

## Scenarios
1. **`GenerateMonthlyStatements`**: Explicit cursor that prints transaction histories for the current calendar month.
2. **`ApplyAnnualFee`**: Explicit cursor using `FOR UPDATE` and `CURRENT OF` to deduct a $50 maintenance fee from all accounts.
3. **`UpdateLoanInterestRates`**: Explicit cursor that raises interest rates on all active loan contracts by 0.5%.

## SQL Script
- [cursors.sql](file:///d:/Akash/CTS/DN5.0-Deep-Skilling-Java-FSE/03-PLSQL/Exercise%206%20-%20Cursors/cursors.sql)

## Mock Output Screenshot
Refer to `Screenshot.png` in this folder representing execution success logs.
