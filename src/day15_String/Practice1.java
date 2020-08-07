package day15_String;

import java.util.Scanner;

public class Practice1 {

    // write a program asks first and last name and print initials

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next(); // Izzet
        char ch1 = firstName.charAt(0);

        System.out.println("Enter your last name");
        String lastName = input.next(); //Lofca
        char ch2 = lastName.charAt(0);

        System.out.println("Your initials is: " +ch1 + "."+ch2+".");
    }
}
