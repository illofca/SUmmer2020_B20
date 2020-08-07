package day21_Loops;
/*
Write a program using while loop, that calculates the sum of the even numbers between
0 and 10
Write a program that asks user to enter his/her username and password until user enters
correctly.
 */

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        System.out.println("===== With For Loop =============");
        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;


            }
        }
        System.out.println(sum);

        System.out.println("======================   With While Loop  =============");


        int sum1 = 0;
        int i1 = 0;
        while (i1 <= 10) {
            i1++;
            if (i1 % 2 == 0) {

                sum1 = sum1 + i1;
            }

        }
        System.out.println(sum1);
        i1++;


    }
}