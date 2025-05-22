package com.task.chapter4;

import java.util.Scanner;

public class question417 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles driven: ");
        int miles = input.nextInt();

        while(miles <= 0){
            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            if(gallons != 0){
                double MPG = (double) miles / gallons;
                System.out.printf("Miles per gallon: %.2f\n", MPG);
                totalMiles += miles;
                totalGallons += gallons;

                double combinedMPG = (double) totalMiles / totalGallons;
                System.out.printf("Combined miles per gallon: %.2f\n", combinedMPG);
            } else {
                System.out.println("Gallons used cannot be zero.");
            }
        }
    }
}
