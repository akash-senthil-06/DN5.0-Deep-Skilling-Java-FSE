# Exercise 3: Implementing the Builder Pattern

## Objective
To develop a system to create complex objects such as a Computer with multiple optional parts using the Builder Pattern to manage the construction process.

## Implementation Details
- **Computer.java**: Product class with attributes representing parts of a computer. It has a private constructor that accepts a `Builder` parameter.
- **Computer.Builder**: Static nested helper class containing methods to set individual attributes and a `build()` method to create and return the final product.
- **BuilderTest.java**: Demonstates creating both basic (minimal options) and high-end gaming (all options) computer configurations using the builder design pattern.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "01-Design-Patterns/Exercise 3 - Builder/*.java"
   ```
3. Run the application:
   ```bash
   java DesignPatterns.Exercise03.BuilderTest
   ```

## Output
```text
Office Computer Configuration:
Computer [CPU=Intel i3, RAM=8GB, Storage=256GB SSD, GraphicsCard=false, Bluetooth=false]
------------------------------------------------
Gaming Computer Configuration:
Computer [CPU=AMD Ryzen 9, RAM=32GB, Storage=2TB NVMe SSD, GraphicsCard=true, Bluetooth=true]
```
