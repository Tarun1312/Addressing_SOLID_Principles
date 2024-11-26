package com.example.Solid_Principle.Solved.DIP;


public class Main {
    public static void main(String[] args) {
        IDiscountService discountService = new DiscountService();
        OrderProcessor orderProcessor = new OrderProcessor(discountService);
        orderProcessor.processOrder(500.0);
    }
}
