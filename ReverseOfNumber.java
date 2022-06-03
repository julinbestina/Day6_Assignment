package com.bridgelabz.day6;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed :");
        int number = sc.nextInt();

        while(number > 0) {
            int remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }

        System.out.println("Reverse of the given number = " + reverse);
    }
}
