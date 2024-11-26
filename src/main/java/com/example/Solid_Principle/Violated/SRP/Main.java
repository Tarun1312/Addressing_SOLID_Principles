package com.example.Solid_Principle.Violated.SRP;

public class Main {
    public static void main(String[] args) {
        // Demonstrating the violation of SRP
        OrderService orderService = new OrderService();
        orderService.processOrder(123); // Order processing
        orderService.manageCustomer(456); // Customer management
        double discount = orderService.calculateDiscount(500.0); // Discount calculation
        System.out.println("Discount: $" + discount);
    }
}
