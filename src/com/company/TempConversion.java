package com.company;

public class TempConversion {
    public static void main(String[] args) {
        int currentTempF = 78;
        double fToC = (currentTempF - 32) * 5/9;
        System.out.println("The current temp in f is "+ currentTempF);
        System.out.print("the current temp in C is "+ fToC);

    }
}
