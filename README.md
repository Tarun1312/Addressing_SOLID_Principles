# Addressing_SOLID_Principles

# Addressing SOLID Principles

This project demonstrates violations and solutions for three SOLID principles:
1. **Single Responsibility Principle (SRP)**
2. **Liskov Substitution Principle (LSP)**
3. **Dependency Inversion Principle (DIP)**

---

## **Use Case**
The project is based on an **Online Food Ordering System**. The system includes:
- Managing customer details.
- Processing orders.
- Calculating discounts for regular and premium customers.

The use case is structured to demonstrate how each SOLID principle can be violated and how these violations can be resolved.

---

## **Project Structure**

---

## **Principles and Their Applications**

### **1. Single Responsibility Principle (SRP)**
- **Definition**: A class should have only one reason to change.
- **Violation**: The `OrderService` class in the `Violated/SRP` folder handles multiple responsibilities:
  - Order processing.
  - Customer management.
  - Discount calculation.
- **Solution**: The `OrderService` class is refactored into three separate classes:
  - `OrderService`: Handles order processing.
  - `CustomerService`: Manages customer information.
  - `DiscountService`: Calculates discounts.
- **Location**: Refactored code can be found in the `Solved/SRP` folder.

---

### **2. Liskov Substitution Principle (LSP)**
- **Definition**: Subtypes must be substitutable for their base types without altering the program's correctness.
- **Violation**: The `PremiumCustomer` class in the `Violated/LSP` folder overrides methods in a way that violates substitutability, causing errors when using the base class (`Customer`).
- **Solution**: The `Customer` class is refactored to an abstract class, with `RegularCustomer` and `PremiumCustomer` properly implementing the behavior of the base class.
- **Location**: Refactored code can be found in the `Solved/LSP` folder.

---

### **3. Dependency Inversion Principle (DIP)**
- **Definition**: High-level modules should not depend on low-level modules; both should depend on abstractions.
- **Violation**: The `OrderProcessor` class in the `Violated/DIP` folder directly depends on the `DiscountService` implementation, making it tightly coupled.
- **Solution**: An interface `IDiscountService` is introduced. The `OrderProcessor` class depends on this interface instead of a specific implementation, allowing flexibility to switch between different discount strategies.
- **Location**: Refactored code can be found in the `Solved/DIP` folder.

