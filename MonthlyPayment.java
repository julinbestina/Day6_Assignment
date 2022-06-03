package com.bridgelabz.day6;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount: ");
        double principalAmount = sc.nextDouble();
        System.out.println("Enter the Year: ");
        int year = sc.nextInt();
        System.out.println("Enter the Interest rate: ");
        double interest = sc.nextDouble();
        calculatePayment(principalAmount, interest, year);
    }

    public static void calculatePayment(double p, double r, int y) {
        double month = 12 * y;
        double rateOfInterest = r / (12 * 100);
        double payment = (p * rateOfInterest) / (1 - Math.pow((1 + rateOfInterest), (-month)));
        System.out.println("Monthly Payment: " + payment);
    }
}
