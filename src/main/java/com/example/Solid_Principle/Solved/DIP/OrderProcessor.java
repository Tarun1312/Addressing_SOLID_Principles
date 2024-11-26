package com.example.Solid_Principle.Solved.DIP;

public class OrderProcessor {
    private final IDiscountService discountService;

    public OrderProcessor(IDiscountService discountService) {
        this.discountService = discountService;
    }

    public void processOrder(double amount) {
        double discount = discountService.calculateDiscount(amount);
        System.out.println("Final amount after discount: " + (amount - discount));
    }
}
