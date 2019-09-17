package com.company;

import java.util.Scanner;

public class rectangle_area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the length of the rectangle");
        double length = scan.nextDouble();
        System.out.print("What is the width of the rectangle");

        double width = scan.nextDouble();
        double area = width * length;
        System.out.print("Area =" + area);
    }
}
