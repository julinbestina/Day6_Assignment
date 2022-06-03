package com.bridgelabz.day6;

public class PrimeNumber {

    public static void main(String[] args) {

        int number = 2;

        while(number < 50) {
            int count = 1;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(number);
            }
            number++;
        }

    }
}

