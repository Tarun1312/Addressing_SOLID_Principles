package com.example.Solid_Principle.Solved.LSP;

public class Main {
    public static void main(String[] args) {
        // Demonstrating correct substitutability for LSP
        Customer regularCustomer = new RegularCustomer();
        System.out.println("Regular Customer Discount: " + regularCustomer.getDiscount());

        Customer premiumCustomer = new PremiumCustomer();
        System.out.println("Premium Customer Discount: " + premiumCustomer.getDiscount());
    }
}
