# Exercise 1: Inventory Management System

## Objective
To understand how data structures like `HashMap` enable efficient data storage and retrieval in a warehouse inventory management system.

## Analysis (Time Complexity)
Using a `HashMap` (where keys are `productId` strings and values are `Product` instances):
- **Add Product**: $O(1)$ average time complexity.
- **Update Product**: $O(1)$ average time complexity.
- **Delete Product**: $O(1)$ average time complexity.

This is highly optimized compared to lists, which require $O(N)$ linear scans to find a product by its ID.

## Implementation Details
- **Product.java**: POJO representing items in inventory.
- **Inventory.java**: Core manager implementing business operations using a `HashMap`.
- **InventoryTest.java**: Test runner showing operations on the inventory.

## How to Run
1. Open terminal/command prompt at the root of the workspace.
2. Compile the files:
   ```bash
   javac -d . "02-Algorithms-DataStructures/Exercise 1 - Inventory Management System/*.java"
   ```
3. Run the application:
   ```bash
   java Algorithms.Exercise01.InventoryTest
   ```

## Output
```text
--- Testing Add Operations ---
Added: Laptop
Added: Smartphone
Added: Headphones
Current Inventory:
Product [ID=P103, Name=Headphones, Quantity=50, Price=$79.99]
Product [ID=P102, Name=Smartphone, Quantity=25, Price=$499.99]
Product [ID=P101, Name=Laptop, Quantity=10, Price=$999.99]

-------------------------------------------
--- Testing Update Operations ---
Updated ID P102 successfully.
Current Inventory:
Product [ID=P103, Name=Headphones, Quantity=50, Price=$79.99]
Product [ID=P102, Name=Smartphone, Quantity=20, Price=$449.99]
Product [ID=P101, Name=Laptop, Quantity=10, Price=$999.99]

-------------------------------------------
--- Testing Delete Operations ---
Deleted: Headphones
Current Inventory:
Product [ID=P102, Name=Smartphone, Quantity=20, Price=$449.99]
Product [ID=P101, Name=Laptop, Quantity=10, Price=$999.99]
```
