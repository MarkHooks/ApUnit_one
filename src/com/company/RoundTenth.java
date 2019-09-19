package com.company;

import java.util.Scanner;

public class RoundTenth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what do you want to round");
        double usernum = scan.nextDouble();
        int roundnum = (int) (usernum * 100);
        roundnum += 5;
        double numround = ((double) (roundnum / 10)) /10;
        System.out.println("this is your number now " + numround);
    }
}