package com.company;
import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        System.out.println("enter four values");
        System.out.print("Value:  ");
        double val1 = scan.nextDouble();
        total += val1;
        System.out.print("Value:  ");
        double val2 = scan.nextDouble();
        total += val2;
        System.out.print("Value:  ");
        double val3 = scan.nextDouble();
        total += val3;
        System.out.print("Value:  ");
        double val4 = scan.nextDouble();
        total += val4;
        double avg = total/4;
        System.out.println("the average is " + avg);
    }
}
