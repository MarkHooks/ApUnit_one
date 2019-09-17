package com.company;

import java.util.Scanner;

public class TotalWithTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the price");
        double price = scan.nextDouble();
        final double TAXCONVERT = 0.0825;
        double taxPrice = price * TAXCONVERT;
        double totalprice = taxPrice + price;
        System.out.println("tax $"+ taxPrice);
        System.out.print("Total price $" + totalprice);
    }
}
