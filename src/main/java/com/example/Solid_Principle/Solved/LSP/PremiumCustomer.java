package com.example.Solid_Principle.Solved.LSP;

public class PremiumCustomer extends Customer {
    @Override
    public double getDiscount() {
        return 0.15; // 15% discount
    }
}
