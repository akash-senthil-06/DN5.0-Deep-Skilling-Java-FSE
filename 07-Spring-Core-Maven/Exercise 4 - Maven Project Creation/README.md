# Exercise 4: Creating and Configuring a Maven Project

## Objective
To set up a Maven project structure (`LibraryManagement`), define dependencies inside `pom.xml`, and configure compiler target versions.

## Implementation Details
- **pom.xml**: Configures Spring Context, Spring AOP, Spring WebMVC, and the compiler plugin targeting Java 1.8.
- **App.java**: Simple program indicating successful project bootstrap.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac "07-Spring-Core-Maven/Exercise 4 - Maven Project Creation/src/main/java/com/library/App.java" -d .
   ```
3. Run the application:
   ```bash
   java com.library.App
   ```

## Output
```text
LibraryManagement Maven Project Initialized successfully!
```
