package com.example.Solid_Principle.Violated.DIP;

public class Main {
    public static void main(String[] args) {
        // Demonstrating the violation of DIP
        DiscountService discountService = new DiscountService();
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.setDiscountService(discountService); // Tight coupling
        orderProcessor.processOrder(500.0);
    }
}
