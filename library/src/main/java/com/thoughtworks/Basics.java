package com.thoughtworks;

public class Basics {
    public boolean isEven(int number) {
        return number%2==0;
    }

    public boolean isOdd(int number) {
        return number%2 != 0;
    }

    public int square(int num) {
        return num*num;
    }

    public int cube(int number) {
        return number*square(number);
    }

    public int gcd(int num1, int num2) {
        if (num1 < num2) {
            int sum;
            sum = num1 + num2;
            num1 = sum - num1;
            num2 = sum - num1;
        }
        int rem = (num1 % num2);
        while (rem != 0) {
            num2 = rem;
            num1 = num2;
            rem = num1 % num2;
        }
        return num2;
    }

    public int lcm(int num1, int num2) {
        return (num1 * num2)/gcd(num1, num2);
    }

    public double factorial(int number) {
        int fact = 1;
        for(int counter = number; counter<=number; counter--){
         fact = counter * fact;
        }
        return fact;
    }

}
