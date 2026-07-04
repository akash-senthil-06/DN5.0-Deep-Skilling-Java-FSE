# Exercise 2: Implementing Dependency Injection

## Objective
To implement Setter Injection in Spring using XML configuration (`applicationContext.xml`) to manage bean wiring between `BookService` and `BookRepository`.

## Implementation Details
- **BookRepository.java**: The dependency target class.
- **BookService.java**: Dependent service holding setter: `setBookRepository(BookRepository)`.
- **applicationContext.xml**: Uses `<property name="bookRepository" ref="bookRepository" />` to map the repository dependency.
- **LibraryManagementApplication.java**: Verifies injection succeeds and saves book.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "07-Spring-Core-Maven/lib/*;." -d . "07-Spring-Core-Maven/Exercise 2 - Dependency Injection/src/main/java/com/library/repository/BookRepository.java" "07-Spring-Core-Maven/Exercise 2 - Dependency Injection/src/main/java/com/library/service/BookService.java" "07-Spring-Core-Maven/Exercise 2 - Dependency Injection/src/main/java/com/library/LibraryManagementApplication.java"
   ```
3. Run the application:
   ```bash
   java -cp "07-Spring-Core-Maven/lib/*;07-Spring-Core-Maven/Exercise 2 - Dependency Injection/src/main/resources;." com.library.LibraryManagementApplication
   ```

## Output
```text
Registering book in BookService...
Saving book: Dependency Injection in Spring to the database.
```
