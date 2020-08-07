package Day14_Recap;

import java.util.Scanner;
/*
 1. write a program for the shipping info that, the program should ask:
                    building number ( nextInt() )
                            nextLine()
                    Street address (Assume it has more than one word) ( nextLine() )
                    city name (nextLine() )
                    state name ( next() )
                    zip code ( nextInt() )
                            nextLine()
                    full name of the person ( nextLine() )
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
 */
public class Address {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        scan.close();

        System.out.println("Please enter your Building Number");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Please enter your Street Name");
        String streetAddress = scan.nextLine();

        System.out.println("Please enter your City");
        String cityName =scan.next();

        System.out.println("Please enter your Zip Code");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.next();

        scan.nextLine();

        System.out.println("Please enter your Full Name");
        String fullName = scan.nextLine();

        System.out.println("Ship To: " + fullName + "\n\t\t " +buildingNumber+ " "+streetAddress + "\n\t\t "+ cityName + ", "+state+" "+ zipCode);

    }

}
