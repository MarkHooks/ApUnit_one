package com.company;

public class Painting {
    public static void main(String[] args) {
        int length = 32;
        int width = 40;
        int height = 16;
        int door = 40;
        int window = 60;
        int celling = length *width;
        int roomarea = ((width * height) * 2) + ((length * height) * 2);
        int paintroom = (roomarea - door - window) + celling;
        double paintneed = paintroom/ 350;
        System.out.print("you will need "+ paintneed+" buckets of paint to paint a room with the area of " +paintroom);
    }
}
