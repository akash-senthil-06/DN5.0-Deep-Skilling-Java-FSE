# Exercise 4: Employee Management System

## Objective
To understand memory representation and operations of array structures by developing an employee record system.

## Analysis (Time Complexity)
Using a raw array to manage records:
- **Add (Insert)**: $O(1)$ (assuming appending to the end of the array, within capacity).
- **Search**: $O(N)$ (requires linear scan to find by ID).
- **Traverse**: $O(N)$ (prints all elements in the array).
- **Delete**: $O(N)$ (requires locating the element and shifting remaining items left to prevent gaps).

**Limitations of Arrays**:
- Fixed size/capacity limit.
- Insertion/deletion at arbitrary positions require shifting ($O(N)$ time).

## Implementation Details
- **Employee.java**: POJO representing employee attributes.
- **EmployeeManager.java**: Manages the array and operations like shifting during deletion.
- **EmployeeTest.java**: Test client checking insertion, lookup, traversal, deletion, and post-deletion states.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "02-Algorithms-DataStructures/Exercise 4 - Employee Management System/*.java"
   ```
3. Run the application:
   ```bash
   java Algorithms.Exercise04.EmployeeTest
   ```

## Output
```text
Added Employee: Alice
Added Employee: Bob
Added Employee: Charlie

-------------------------------------------
Employee Records:
Employee [ID=E001, Name=Alice, Position=Manager, Salary=$85000.0]
Employee [ID=E002, Name=Bob, Position=Developer, Salary=$65000.0]
Employee [ID=E003, Name=Charlie, Position=Designer, Salary=$60000.0]

-------------------------------------------
Searching for Employee E002:
Employee [ID=E002, Name=Bob, Position=Developer, Salary=$65000.0]

-------------------------------------------
Deleted Employee ID: E002

-------------------------------------------
Employee Records:
Employee [ID=E001, Name=Alice, Position=Manager, Salary=$85000.0]
Employee [ID=E003, Name=Charlie, Position=Designer, Salary=$60000.0]
```
