package com.task.chapter2;

import java.util.Scanner;

public class question233 {
    public static void main(String[] args) {

        //calculating the bmi standard calculator
        Scanner input = new Scanner(System.in);
        System.out.print("BMI Calculator\n ");
        System.out.print("Choose Preferred Unit System\n");
        System.out.print("1:Enter your weight in pounds/Inches: ");
        System.out.print("2:Enter your weight in kilograms/meters: ");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        int bmi = 0;

        if(choice == 1) {
            System.out.print("Enter your weight in pounds: ");
            double weight = input.nextDouble();
            System.out.print("Enter your height in inches: ");
            double height = input.nextDouble();
            bmi = (int) ((weight / (height * height)) * 703);
        } else if(choice == 2) {
            System.out.print("Enter your weight in kilograms: ");
            double weight = input.nextDouble();
            System.out.print("Enter your height in meters: ");
            double height = input.nextDouble();
            bmi = (int) (weight / (height * height));
        } else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println("\nYour BMI is: " + bmi);
        System.out.println("\nBMI Categories:");
        System.out.println("Underweight = less than 18.5");
        System.out.println("Normal weight = 18.5–24.9");
        System.out.println("Overweight = 25–29.9");
        System.out.println("Obesity = BMI of 30 or greater");





    }
}
