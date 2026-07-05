# Exercise 3: Implementing Logging with Spring AOP

## Objective
To implement Logging capabilities using Spring AOP (Aspect-Oriented Programming) to log method execution times.

## Implementation Details
- **LoggingAspect.java**: Declares an `@Around` advice executing on `BookService` methods to log execution timings.
- **applicationContext.xml**: Registers Aspect bean and enables autoproxying (`<aop:aspectj-autoproxy />`).
- **LibraryManagementApplication.java**: Runs the service method inside the aspect execution block.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -cp "07-Spring-Core-Maven/lib/*;." -d . "07-Spring-Core-Maven/src/test/java/org/aspectj/lang/*.java" "07-Spring-Core-Maven/src/test/java/org/aspectj/lang/annotation/*.java" "07-Spring-Core-Maven/Exercise 3 - Logging with Spring AOP/src/main/java/com/library/repository/BookRepository.java" "07-Spring-Core-Maven/Exercise 3 - Logging with Spring AOP/src/main/java/com/library/service/BookService.java" "07-Spring-Core-Maven/Exercise 3 - Logging with Spring AOP/src/main/java/com/library/aspect/LoggingAspect.java" "07-Spring-Core-Maven/Exercise 3 - Logging with Spring AOP/src/main/java/com/library/LibraryManagementApplication.java"
   ```
3. Run the application:
   ```bash
   java -cp "07-Spring-Core-Maven/lib/*;07-Spring-Core-Maven/Exercise 3 - Logging with Spring AOP/src/main/resources;." com.library.LibraryManagementApplication
   ```

## Output
```text
Loading Spring context (Simulated AOP)...
Registering book in BookService...
Saving book: Spring AOP Logging Concept to the database.
  [AOP LOG] Method registerBook executed in 10 ms
```
