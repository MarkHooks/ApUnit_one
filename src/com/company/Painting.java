package com.company;
import java.util.Scanner;
public class Painting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the length of the room?");
        double length = scan.nextDouble();
        System.out.print("What is the width of the room?");
        double width = scan.nextDouble();
        System.out.print("What is the height of the room?");
        double height = scan.nextDouble();
        final int paint = 350;
        int door = 40;
        int window = 60;
        double celling = length *width;
        double roomarea = ((width * height) * 2) + ((length * height) * 2);
        double paintroom = (roomarea - door - window) + celling;
        double paintneed = Math.round(paintroom/ 350);
        System.out.print("you will need "+ paintneed+" buckets of paint to paint a room with the area of " +paintroom);
    }
}
