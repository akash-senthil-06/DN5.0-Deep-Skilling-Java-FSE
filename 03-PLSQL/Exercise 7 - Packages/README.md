# Exercise 7: Packages

## Objective
To group logically related procedures, functions, and variables into modular Oracle DB Package Specifications and Package Bodies.

## Packages
1. **`CustomerManagement`**:
   - `AddNewCustomer`: Adds new customer record.
   - `UpdateCustomer`: Updates customer profile attributes.
   - `GetCustomerBalance`: Function returning a customer's balance.
2. **`EmployeeManagement`**:
   - `HireEmployee`: Inserts a new employee record.
   - `UpdateEmployee`: Modifies job title/salary.
   - `CalculateAnnualSalary`: Function returning annual salary ($12 \times \text{monthly salary}$).
3. **`AccountOperations`**:
   - `OpenAccount`: Opens a new account.
   - `CloseAccount`: Closes an account by ID.
   - `GetTotalCustomerBalance`: Sums the balance of all accounts linked to a specific customer.

## SQL Script
- [packages.sql](file:///d:/Akash/CTS/DN5.0-Deep-Skilling-Java-FSE/03-PLSQL/Exercise%207%20-%20Packages/packages.sql)

## Mock Output Screenshot
Refer to `Screenshot.png` in this folder representing execution success logs.
