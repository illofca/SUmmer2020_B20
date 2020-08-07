package Replit;

import java.util.Scanner;

public class SliceNUmber {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int nums, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);

       System.out.println("Enter your number:");

        String digits = scan.next();

        String[] numString = digits.split("");

        for (String each : numString) {

            System.out.println(each);



        }

        System.out.println("========Solution with / and % ==================================");

        System.out.println("Enter your number:");

        nums = scan.nextInt();
        digit1 = nums % 100000 /10000;
            System.out.println(digit1);
        digit2 = nums % 10000 /1000;
            System.out.println(digit2);
        digit3 = nums % 1000 /100;
            System.out.println(digit3);
        digit4 = nums % 100 /10;
            System.out.println(digit4);
        digit5 = nums % 10/1;
            System.out.println(digit5);



    }
}