package com.task.chapter4;

import java.util.Scanner;

public class question421 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int num;
        int largest = Integer.MIN_VALUE;

        while(counter < 10){
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if(num > largest){
                largest = num;
            }
            counter++;
        }
        System.out.println("The largest number is: " + largest);
    }
}
