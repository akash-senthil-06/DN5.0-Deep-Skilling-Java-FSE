# Exercise 6: Library Management System

## Objective
To search for books by title in a library catalog, comparing Linear Search and Binary Search algorithms.

## Analysis (Time Complexity)
- **Linear Search**:
  - Time Complexity: $O(N)$ (Average/Worst).
  - Suitable for small collections or unsorted records.
- **Binary Search**:
  - Time Complexity: $O(\log N)$ (Average/Worst).
  - Suitable for large catalogs where items are sorted.

## Implementation Details
- **Book.java**: POJO representing a book, implementing `Comparable` to enable easy sorting.
- **Library.java**: Contains static methods implementing Linear Search and Binary Search algorithms.
- **LibraryTest.java**: Test client sorting the catalog and executing search routines.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "02-Algorithms-DataStructures/Exercise 6 - Library Management System/*.java"
   ```
3. Run the application:
   ```bash
   java Algorithms.Exercise06.LibraryTest
   ```

## Output
```text
--- Linear Search Test ---
Found: Book [ID=B003, Title="1984", Author="George Orwell"]

-------------------------------------------
--- Binary Search Test ---
Sorted Library Catalog:
Book [ID=B003, Title="1984", Author="George Orwell"]
Book [ID=B004, Title="Moby Dick", Author="Herman Melville"]
Book [ID=B005, Title="Pride and Prejudice", Author="Jane Austen"]
Book [ID=B001, Title="The Great Gatsby", Author="F. Scott Fitzgerald"]
Book [ID=B002, Title="To Kill a Mockingbird", Author="Harper Lee"]

Found Moby Dick: Book [ID=B004, Title="Moby Dick", Author="Herman Melville"]
Found The Hobbit: null
```
