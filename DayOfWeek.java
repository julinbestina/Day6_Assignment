package com.bridgelabz.day6;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Day: ");
        int day = sc.nextInt();
        System.out.print("Enter the Month: ");
        int month = sc.nextInt();
        System.out.print("Enter the Year: ");
        int year = sc.nextInt();

        int y = year - (14 - month) / 12;
        int x = y + (y / 4) - (y / 100) + (y / 400);
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + ((31 * m) / 12)) % 7;

        switch (d) {
            case 0:
                System.out.print("Sunday");break;
            case 1:
                System.out.print("Monday");break;
            case 2:
                System.out.print("Tuesday");break;
            case 3:
                System.out.print("Wednesday");break;
            case 4:
                System.out.print("Thursday");break;
            case 5:
                System.out.print("Friday");break;
            case 6:
                System.out.print("Saturday");break;
        }

    }
}

