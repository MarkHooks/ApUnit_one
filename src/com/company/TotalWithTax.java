package com.company;

public class TotalWithTax {
    public static void main(String[] args) {
        double price = 52.75;
        final double TAXCONVERT = 0.0825;
        double taxPrice = price * TAXCONVERT;
        double totalprice = taxPrice + price;
        System.out.println("Price $" + price);
        System.out.println("tax $"+ taxPrice);
        System.out.print("Total price $" + totalprice);
    }
}
