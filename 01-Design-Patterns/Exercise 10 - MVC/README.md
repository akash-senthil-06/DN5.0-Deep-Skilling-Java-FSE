# Exercise 10: Implementing the Model-View-Controller (MVC) Pattern

## Objective
To develop a simple application for managing student records using the Model-View-Controller (MVC) architecture pattern.

## Implementation Details
- **Student.java**: Model class representing the data structure (attributes: `name`, `id`, `grade`).
- **StudentView.java**: View class responsible for displaying/formatting the data to the console output.
- **StudentController.java**: Controller class that manages data updates on the Model and triggers the View to update the output accordingly.
- **MVCTest.java**: Test application initializing a student model, using the controller to update student details, and reflecting those changes in the view.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "01-Design-Patterns/Exercise 10 - MVC/*.java"
   ```
3. Run the application:
   ```bash
   java DesignPatterns.Exercise10.MVCTest
   ```

## Output
```text
Displaying initial student state:
Student Details:
Name: Akash
ID: CS01
Grade: B

-------------------------------------------
Updating student grade and name...

Displaying updated student state:
Student Details:
Name: Akash Senthil
ID: CS01
Grade: A+
```
