package day20_WhileLoops;
/*Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop

 */

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for(int i = 0; i ==0;){ //infinite loop: both the initializer and the condition is same it creates an infinite loop
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if(num<0){ // if number is negative exit the loop and calculate entered numbers
                break;
            }
            sum += num;

        }
        System.out.println("sum is: "+sum);





    }






}
