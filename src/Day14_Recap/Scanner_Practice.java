package Day14_Recap;

import java.util.Scanner;

/*1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )

*/
public class Scanner_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your gender");
        String gender = input.next();

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your country name");
        String country = input.nextLine();
        input.nextLine(); // to take out the Enter left in the memory

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();

        System.out.println("Enter your Full Name");
        String fullName = input.nextLine();
        input.nextLine(); // to tak out the Enter left in the memory

        System.out.println("Enter your full company name");
        String companyName = input.nextLine();

    }
}
