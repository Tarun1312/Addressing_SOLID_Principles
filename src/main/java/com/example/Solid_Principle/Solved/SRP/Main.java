package com.example.Solid_Principle.Solved.SRP;

public class Main {
    public static void main(String[] args) {
        // Demonstrating the refactored solution for SRP
        OrderService orderService = new OrderService();
        orderService.processOrder(123);

        CustomerService customerService = new CustomerService();
        customerService.manageCustomer(456);

        DiscountService discountService = new DiscountService();
        double discount = discountService.calculateDiscount(500.0);
        System.out.println("Discount: $" + discount);
    }
}
