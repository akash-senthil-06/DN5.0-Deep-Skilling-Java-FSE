# Exercise 9: Implementing the Command Pattern

## Objective
To develop a home automation system where commands are issued to turn devices (e.g. a Light) on or off using the Command Pattern.

## Implementation Details
- **Command.java**: Command interface declaring the `execute()` action.
- **Light.java**: Receiver class which knows how to perform the actual operations to turn a light on or off.
- **LightOnCommand.java**, **LightOffCommand.java**: Concrete commands wrapping actions on the receiver (`Light`) and implementing the `Command` interface.
- **RemoteControl.java**: Invoker class holding a reference to a `Command` object and executing it on demand.
- **CommandTest.java**: Test application demonstrating setting and invoking different commands through the invoker.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "01-Design-Patterns/Exercise 9 - Command/*.java"
   ```
3. Run the application:
   ```bash
   java DesignPatterns.Exercise09.CommandTest
   ```

## Output
```text
Testing Remote: Setting Light ON Command...
The light is ON.

-------------------------------------------
Testing Remote: Setting Light OFF Command...
The light is OFF.
```
