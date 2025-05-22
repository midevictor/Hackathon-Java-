package com.task.chapter2;

import java.util.Scanner;

public class question226 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter a second number: ");
        int secondNumber = input.nextInt();

        int tripleFirst = firstNumber * 3;
        int doubleSecond = secondNumber * 2;

        if(firstNumber % secondNumber == 0) {
            System.out.println("The first number is divisible by the second number");
        } else {
            System.out.println("The first number is not divisible by the second number");
        }
    }
}
