package com.example.Solid_Principle.Violated.DIP;

public class DiscountService {
    public double calculateDiscount(double totalAmount) {
        return totalAmount * 0.10; // 10% discount
    }
}
