package com.company;

import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total amount of cents");
        final int change = scan.nextInt();
        final int dollars = 100;
        final int quarter = 25;
        final int dimes = 10;
        final int nickels = 5;
        final int penny = 1;
        int numDollars = change/dollars;
        System.out.print("You have "+numDollars+ "Dollars");
        int mquarters = (change - (numDollars * dollars));
        int numquarters = mquarters/quarter;
        System.out.print(", " +numquarters+" Quarters");
        int mdimes = (change - ((numquarters * quarter)+(numDollars *dollars)));
        int numDimes = mdimes/dimes;
        System.out.print(", " +numDimes+ " Dimes");
        int mnickels = (change - ((numquarters * quarter)+(numDollars *dollars)+(numDimes* dimes)));
        int numNickesl = mnickels/nickels;
        System.out.print(", "+numNickesl+ " Nickels");
        int mPenny = (change - ((numquarters * quarter)+(numDollars *dollars)+(numDimes* dimes)+(numNickesl* nickels)));
        int numPenny = mPenny/penny;
        System.out.println(" and " + numPenny+" Pennies");

    }
}
