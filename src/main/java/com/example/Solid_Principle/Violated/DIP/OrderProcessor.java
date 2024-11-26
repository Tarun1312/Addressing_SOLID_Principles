package com.example.Solid_Principle.Violated.DIP;

public class OrderProcessor {
    private final DiscountService discountService = new DiscountService();

    public void processOrder(double amount) {
        double discount = discountService.calculateDiscount(amount);
        System.out.println("Final amount after discount: " + (amount - discount));
    }

    public void setDiscountService(DiscountService discountService) {
    }
}
