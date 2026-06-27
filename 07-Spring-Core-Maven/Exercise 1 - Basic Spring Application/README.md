# Exercise 1: Configuring a Basic Spring Application

## Objective
To configure a basic Spring application context using XML configuration to declare repository and service beans.

## Implementation Details
- **BookRepository.java**: Handles saving records.
- **BookService.java**: Dependent business service class.
- **applicationContext.xml**: Declares beans for both classes without dependency injection.
- **LibraryManagementApplication.java**: Instantiates context and runs method validation.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "07-Spring-Core-Maven/lib/*;." -d . "07-Spring-Core-Maven/Exercise 1 - Basic Spring Application/src/main/java/com/library/repository/BookRepository.java" "07-Spring-Core-Maven/Exercise 1 - Basic Spring Application/src/main/java/com/library/service/BookService.java" "07-Spring-Core-Maven/Exercise 1 - Basic Spring Application/src/main/java/com/library/LibraryManagementApplication.java"
   ```
3. Run the application:
   ```bash
   java -cp "07-Spring-Core-Maven/lib/*;07-Spring-Core-Maven/Exercise 1 - Basic Spring Application/src/main/resources;." com.library.LibraryManagementApplication
   ```

## Output (Expected before DI)
```text
Registering book in BookService...
Error: BookRepository is not injected!
```
