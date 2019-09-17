package com.company;

import java.util.Scanner;

public class PoundsToKillograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the pounds");
        double pounds = scan.nextDouble();
        double killogramconv = pounds/2.205;
        System.out.print(killogramconv);
    }
}
