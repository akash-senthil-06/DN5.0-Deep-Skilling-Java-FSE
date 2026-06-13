# Exercise 2: Implementing the Factory Method Pattern

## Objective
To develop a document management system that creates different types of documents (e.g., Word, PDF, Excel) using the Factory Method Pattern.

## Implementation Details
- **Document.java**: Interface with `open()` and `close()` operations.
- **WordDocument.java**, **PdfDocument.java**, **ExcelDocument.java**: Concrete implementations of `Document`.
- **DocumentFactory.java**: Abstract creator class declaring the factory method `createDocument()`.
- **WordDocumentFactory.java**, **PdfDocumentFactory.java**, **ExcelDocumentFactory.java**: Concrete creator classes overriding the factory method to return instances of respective documents.
- **FactoryMethodTest.java**: Demonstrates creating each type of document using their respective factories.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "01-Design-Patterns/Exercise 2 - Factory Method/*.java"
   ```
3. Run the application:
   ```bash
   java DesignPatterns.Exercise02.FactoryMethodTest
   ```

## Output
```text
Opening Word Document...
Closing Word Document...
-----------------------------------
Opening PDF Document...
Closing PDF Document...
-----------------------------------
Opening Excel Document...
Closing Excel Document...
```
