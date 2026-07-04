# Exercise 6: Configuring Beans with Annotations

## Objective
To simplify Spring configuration using annotation scanning (`@Service`, `@Repository`, `@Autowired`) and enabling component scanning (`<context:component-scan />`) in the XML application context.

## Implementation Details
- **BookRepository.java**: Annotated with `@Repository`.
- **BookService.java**: Annotated with `@Service`, holding dependency mapped via `@Autowired`.
- **applicationContext.xml**: Uses `<context:component-scan base-package="com.library" />` to trigger classpath scans.
- **LibraryManagementApplication.java**: Fetches beans and executes operations.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac --release 17 -cp "07-Spring-Core-Maven/lib/*;." -d . "07-Spring-Core-Maven/Exercise 6 - Beans Configuration with Annotations/src/main/java/com/library/repository/BookRepository.java" "07-Spring-Core-Maven/Exercise 6 - Beans Configuration with Annotations/src/main/java/com/library/service/BookService.java" "07-Spring-Core-Maven/Exercise 6 - Beans Configuration with Annotations/src/main/java/com/library/LibraryManagementApplication.java"
   ```
3. Run the application:
   ```bash
   java -cp "07-Spring-Core-Maven/lib/*;07-Spring-Core-Maven/Exercise 6 - Beans Configuration with Annotations/src/main/resources;." com.library.LibraryManagementApplication
   ```

## Output
```text
BookService registering book using Annotation configuration...
Saving book: Annotation-Based Configuration in Spring via Annotation-based Repository.
```
