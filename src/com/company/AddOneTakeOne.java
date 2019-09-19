package com.company;

import java.util.Scanner;

public class AddOneTakeOne {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scan.nextInt();
        num--;
        System.out.print(num);
        num++;
        System.out.print(num);
        num++;
        System.out.print(num);

    }


}
