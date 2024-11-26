package com.example.Solid_Principle.Violated.SRP;

public class OrderService {
    public void processOrder(int orderId) {
        System.out.println("Processing order: " + orderId);
    }

    public void manageCustomer(int customerId) {
        System.out.println("Managing customer: " + customerId);
    }

    public double calculateDiscount(double totalAmount) {
        return totalAmount * 0.10; // 10% discount
    }
}
