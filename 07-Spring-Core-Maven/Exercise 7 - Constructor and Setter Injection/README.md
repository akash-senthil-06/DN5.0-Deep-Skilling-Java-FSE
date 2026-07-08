# Exercise 7: Implementing Constructor and Setter Injection

## Objective
To implement both Constructor and Setter Dependency Injections inside a Spring Context using XML configuration schemas.

## Implementation Details
- **BookRepository.java**: Target dependency class.
- **BookService.java**: Dependent class implementing both parametrized constructor `BookService(BookRepository)` and setter `setBookRepository(BookRepository)`.
- **applicationContext.xml**: Uses `<constructor-arg ref="bookRepository" />` and `<property name="bookRepository" ref="bookRepository" />` respectively.
- **LibraryManagementApplication.java**: Instantiates and tests both bean configurations.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac --release 17 -cp "07-Spring-Core-Maven/lib/*;." -d . "07-Spring-Core-Maven/Exercise 7 - Constructor and Setter Injection/src/main/java/com/library/repository/BookRepository.java" "07-Spring-Core-Maven/Exercise 7 - Constructor and Setter Injection/src/main/java/com/library/service/BookService.java" "07-Spring-Core-Maven/Exercise 7 - Constructor and Setter Injection/src/main/java/com/library/LibraryManagementApplication.java"
   ```
3. Run the application:
   ```bash
   java -cp "07-Spring-Core-Maven/lib/*;07-Spring-Core-Maven/Exercise 7 - Constructor and Setter Injection/src/main/resources;." com.library.LibraryManagementApplication
   ```

## Output
```text
BookService: Parametrized constructor called.
BookService: Default constructor called.
BookService: Setter method called.

--- Testing Constructor Injection ---
Registering book...
Saving book: Learning Spring via Constructor DI via Repository.

--- Testing Setter Injection ---
Registering book...
Saving book: Learning Spring via Setter DI via Repository.
```
