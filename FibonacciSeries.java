package com.bridgelabz.day6;

public class FibonacciSeries {
    
        public static void main(String[] args) {

            int nextTerm = 1, preTerm = 0, fib;
            System.out.println(preTerm);
            System.out.println(nextTerm);

            for( int i = 2; i < 10; i++) {
                fib = nextTerm + preTerm;
                System.out.println(fib);
                preTerm=nextTerm;
                nextTerm = fib;
            }
        }

    }


