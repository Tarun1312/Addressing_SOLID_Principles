package com.example.Solid_Principle.Violated.LSP;

public class PremiumCustomer extends Customer {
    @Override
    public double getDiscount() {
        throw new UnsupportedOperationException("Not applicable for Premium customers.");
    }
}
