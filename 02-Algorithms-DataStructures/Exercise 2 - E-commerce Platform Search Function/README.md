# Exercise 2: E-commerce Platform Search Function

## Objective
To understand search complexities in E-commerce platforms by comparing Linear Search and Binary Search algorithms.

## Analysis (Algorithmic Comparison)
- **Linear Search**:
  - Time Complexity: $O(N)$ (Average/Worst), $O(1)$ (Best).
  - Requirements: None. Works on unsorted data.
- **Binary Search**:
  - Time Complexity: $O(\log N)$ (Average/Worst), $O(1)$ (Best).
  - Requirements: Data **must be sorted** prior to search. Sorting costs $O(N \log N)$.

**Recommendation**: Use Binary Search if searches are performed frequently on static or infrequently modified catalogs. If data updates continuously and search frequency is low, Linear Search might avoid the overhead of re-sorting.

## Implementation Details
- **Product.java**: Product model implementing `Comparable` to sort by name.
- **SearchAlgorithms.java**: Implements linear scan and binary subdivision search algorithms.
- **SearchTest.java**: Test runner showing search operations and sorting logic.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "02-Algorithms-DataStructures/Exercise 2 - E-commerce Platform Search Function/*.java"
   ```
3. Run the application:
   ```bash
   java Algorithms.Exercise02.SearchTest
   ```

## Output
```text
--- Linear Search Test ---
Found: Product [ID=P003, Name=Desk Chair, Category=Furniture]

-------------------------------------------
--- Binary Search Test ---
Sorted Products:
Product [ID=P005, Name=Backpack, Category=Accessories]
Product [ID=P004, Name=Coffee Mug, Category=Kitchenware]
Product [ID=P003, Name=Desk Chair, Category=Furniture]
Product [ID=P001, Name=Laptop, Category=Electronics]
Product [ID=P002, Name=Smartphone, Category=Electronics]

Found Laptop: Product [ID=P001, Name=Laptop, Category=Electronics]
Found Tablet: null
```
