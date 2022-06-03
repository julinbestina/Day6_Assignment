package com.bridgelabz.day6;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal number: ");
        int decimal = sc.nextInt();
        convertToBinary(decimal);
    }

    public static void convertToBinary(int num) {
        String binary = Integer.toBinaryString(num);

        for (int i = binary.length(); i < 8; i++) {
            binary += "0";
        }

        System.out.println(binary);
    }
}



