package com.company;

import java.util.Scanner;

public class RoundNegatives {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("what do you want to round");
        double usernum = scan.nextDouble();

        int negnum = (int)(usernum - 0.5);
        System.out.println("this is your number now" + negnum);
    }
}
