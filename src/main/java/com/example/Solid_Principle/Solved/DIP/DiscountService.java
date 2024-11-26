package com.example.Solid_Principle.Solved.DIP;

public class DiscountService implements IDiscountService {
    @Override
    public double calculateDiscount(double totalAmount) {
        return totalAmount * 0.10;
    }
}
