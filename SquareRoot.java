package com.bridgelabz.day6;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = sc.nextInt();
        computeSqrt(number);
    }

    public static void computeSqrt(double num) {
        double x = num;
        double epsilon = 0.000000000000001;
        while (true) {
            x = (num / x + x) / 2;
            if (Math.abs(x - num / x) < epsilon) {
                break;
            }
        }
        System.out.println(x);
    }
}
