package day13_Scanner;

import java.util.Scanner;

public class NextLine_VS_NextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Enter (in the scanner's memory)
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble(); //120000

       scan.nextLine(); // we use this to take out Enters that are left in the scanner that, so that we can use the next input
        // Enter

        System.out.println("Enter full name: ");
        String  fullName =scan.nextLine();

        System.out.println("Salary :" + salary);
        System.out.println("Full Name: " +fullName);

// when nextLine(); method is used after other next methods, it will put ENter after the value , so to overcome this we add scan.nextLine();


    }
}
