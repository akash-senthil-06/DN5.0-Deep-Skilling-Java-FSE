# Exercise 3: Sorting Customer Orders

## Objective
To sort customer orders on an e-commerce platform by their total price, comparing the performance of Bubble Sort and Quick Sort.

## Analysis (Algorithmic Comparison)
- **Bubble Sort**:
  - Time Complexity: $O(N^2)$ (Average/Worst), $O(N)$ (Best - if optimized).
  - Space Complexity: $O(1)$ (In-place).
- **Quick Sort**:
  - Time Complexity: $O(N \log N)$ (Average/Best), $O(N^2)$ (Worst).
  - Space Complexity: $O(\log N)$ (Recursive call stack).

**Conclusion**: Quick Sort is generally preferred over Bubble Sort because its average time complexity is $O(N \log N)$ which scales significantly better than Bubble Sort's $O(N^2)$ for large data sets.

## Implementation Details
- **Order.java**: Class containing details of the customer order.
- **SortingAlgorithms.java**: Implements Bubble Sort and Quick Sort algorithms.
- **SortTest.java**: Test runner showing the sorting outputs of both methods.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "02-Algorithms-DataStructures/Exercise 3 - Sorting Customer Orders/*.java"
   ```
3. Run the application:
   ```bash
   java Algorithms.Exercise03.SortTest
   ```

## Output
```text
--- Bubble Sort ---
Order [ID=O004, Customer=Diana, TotalPrice=$80.25]
Order [ID=O002, Customer=Bob, TotalPrice=$120.0]
Order [ID=O001, Customer=Alice, TotalPrice=$250.5]
Order [ID=O005, Customer=Ethan, TotalPrice=$300.0]
Order [ID=O003, Customer=Charlie, TotalPrice=$450.0]

-------------------------------------------
--- Quick Sort ---
Order [ID=O004, Customer=Diana, TotalPrice=$80.25]
Order [ID=O002, Customer=Bob, TotalPrice=$120.0]
Order [ID=O001, Customer=Alice, TotalPrice=$250.5]
Order [ID=O005, Customer=Ethan, TotalPrice=$300.0]
Order [ID=O003, Customer=Charlie, TotalPrice=$450.0]
```
