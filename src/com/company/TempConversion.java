package com.company;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the temp?");
        double currentTempF = scan.nextDouble();
        double fToC = (currentTempF - 32) * 5/9;
        System.out.print("the current temp in C is "+ fToC);

    }
}
