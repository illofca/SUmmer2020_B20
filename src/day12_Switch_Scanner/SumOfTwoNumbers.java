package day12_Switch_Scanner;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num = scan.nextInt();
        System.out.println("Enter your second number");
        int num2 = scan.nextInt();

        int  sum = num + num2;

        System.out.println("Sum of two numbers are: "+ sum);
    }
}
