# Exercise 5: Task Management System

## Objective
To understand Singly Linked Lists by creating a custom list structure to add, search, traverse, and delete tasks dynamically.

## Analysis (Time Complexity)
Using a Singly Linked List:
- **Add**: $O(1)$ (if inserting at the head) or $O(N)$ (if traversing to append to the end).
- **Search**: $O(N)$ (linear search required to find by ID).
- **Traverse**: $O(N)$ (must visit each node once).
- **Delete**: $O(N)$ (requires locating the element and updating pointers).

**Advantages over Arrays**:
- Dynamic size; does not require allocating a fixed-size block of memory.
- Insertions and deletions do not require shifting elements in memory (only pointer updates are needed once the node is located).

## Implementation Details
- **Task.java**: Represents the task entity.
- **TaskLinkedList.java**: Node-based linked list manager.
- **TaskTest.java**: Test client checking list creation, traversal, lookup, deletion, and post-deletion states.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "02-Algorithms-DataStructures/Exercise 5 - Task Management System/*.java"
   ```
3. Run the application:
   ```bash
   java Algorithms.Exercise05.TaskTest
   ```

## Output
```text
Added Task: Design Database
Added Task: Develop API
Added Task: Write Unit Tests

-------------------------------------------
Tasks List:
Task [ID=T001, Name=Design Database, Status=Completed]
Task [ID=T002, Name=Develop API, Status=In Progress]
Task [ID=T003, Name=Write Unit Tests, Status=Pending]

-------------------------------------------
Searching for Task T002:
Task [ID=T002, Name=Develop API, Status=In Progress]

-------------------------------------------
Deleted Task ID: T002

-------------------------------------------
Tasks List:
Task [ID=T001, Name=Design Database, Status=Completed]
Task [ID=T003, Name=Write Unit Tests, Status=Pending]
```
