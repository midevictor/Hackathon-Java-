package com.task.chapter4;

import java.util.Scanner;

public class question431 {
    public static void main(String[] args) {

        //palindrome number (5 digits)
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 5 digit");
        String numberStr = input.next();
        String reverseStr = new StringBuilder(numberStr).reverse().toString();
        if(numberStr.equals(reverseStr)){
            System.out.print(numberStr + "is a palindrome");
        } else{
            System.out.print(numberStr + "is not a palindrome");
        }

    }
}
