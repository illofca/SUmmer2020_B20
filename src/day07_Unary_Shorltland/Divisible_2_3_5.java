package day07_Unary_Shorltland;

public class Divisible_2_3_5 {

    public static void main(String[] args) {

        // write a program Divisible_2_3_4 that can check if a number is evenly divisible by 2, 3, 5

        int number = 1000;

        boolean divisibleBy2 = number % 2 == 0;
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        System.out.println(number + " is evenly divisible by 2: " + divisibleBy2);
        System.out.println(number + " is evenly divisible by 2: " + divisibleBy3);
        System.out.println(number + " is evenly divisible by 2: " + divisibleBy5);
    }
}
