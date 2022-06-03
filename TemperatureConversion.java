package com.bridgelabz.day6;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversion cs = new Conversion();

        System.out.println("Enter the temperature in Fahrenheit");
        float fahrenheit = sc.nextFloat();
        cs.convertToCelsius(fahrenheit);

        System.out.println("Enter the temperature in Celsius");
        float celsius = sc.nextFloat();
        cs.convertToFahrenheit(celsius);
    }
}

class Conversion {
    public void convertToCelsius(float f) {
        float c = (f - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + c);
    }

    public void convertToFahrenheit(float c) {
        float f = (c * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + f);
    }
}