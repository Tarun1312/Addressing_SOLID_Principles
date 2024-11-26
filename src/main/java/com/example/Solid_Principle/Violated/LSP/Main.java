package com.example.Solid_Principle.Violated.LSP;

public class Main {
    public static void main(String[] args) {
        // Demonstrating the violation of LSP
        Customer regularCustomer = new Customer();
        System.out.println("Regular Customer Discount: " + regularCustomer.getDiscount());

        Customer premiumCustomer = new PremiumCustomer();
        try {
            System.out.println("Premium Customer Discount: " + premiumCustomer.getDiscount());
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: PremiumCustomer does not support this operation!");
        }
    }
}
