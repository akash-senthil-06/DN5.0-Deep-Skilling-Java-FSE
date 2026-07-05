# Exercise 8: Implementing Basic AOP with Spring

## Objective
To implement basic AOP features, defining explicit `@Before` and `@After` advices to separate cross-cutting concerns (logging) from business layers.

## Implementation Details
- **LoggingAspect.java**: Declares advices `logBefore(JoinPoint)` and `logAfter(JoinPoint)`.
- **applicationContext.xml**: Enables AOP autoproxying.
- **LibraryManagementApplication.java**: Invokes target methods wrapped inside advice calls.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac --release 17 -cp "07-Spring-Core-Maven/lib/*;." -d . "07-Spring-Core-Maven/src/test/java/org/aspectj/lang/*.java" "07-Spring-Core-Maven/src/test/java/org/aspectj/lang/annotation/*.java" "07-Spring-Core-Maven/Exercise 8 - Basic AOP with Spring/src/main/java/com/library/repository/BookRepository.java" "07-Spring-Core-Maven/Exercise 8 - Basic AOP with Spring/src/main/java/com/library/service/BookService.java" "07-Spring-Core-Maven/Exercise 8 - Basic AOP with Spring/src/main/java/com/library/aspect/LoggingAspect.java" "07-Spring-Core-Maven/Exercise 8 - Basic AOP with Spring/src/main/java/com/library/LibraryManagementApplication.java"
   ```
3. Run the application:
   ```bash
   java -cp "07-Spring-Core-Maven/lib/*;07-Spring-Core-Maven/Exercise 8 - Basic AOP with Spring/src/main/resources;." com.library.LibraryManagementApplication
   ```

## Output
```text
Loading Spring context (Simulated AOP Before/After Advice)...
  [AOP LOG] Before executing method: registerBook
Registering book in BookService...
Saving book: Spring Framework AOP Advices to database.
  [AOP LOG] After executing method: registerBook
```
