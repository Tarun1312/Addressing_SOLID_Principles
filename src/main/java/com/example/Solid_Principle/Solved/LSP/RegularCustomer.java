package com.example.Solid_Principle.Solved.LSP;

public class RegularCustomer extends Customer {
    @Override
    public double getDiscount() {
        return 0.05; // 5% discount
    }
}
