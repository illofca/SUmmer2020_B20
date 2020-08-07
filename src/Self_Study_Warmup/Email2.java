package Self_Study_Warmup;

import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email");
        String email = scan.next();

        String firstName = email.substring(0, email.indexOf('_'));
        String lastName = email.substring((email.indexOf('_') + 1), (email.indexOf('@')));
        String domain = email.substring((email.indexOf('@') + 1),(email.indexOf('.')));
        String topDomain = email.substring((email.indexOf('.') + 1),(email.length()));
        char firstName1 = firstName.toUpperCase().charAt(0);
        char lastName1 = lastName.toUpperCase().charAt(0);




        System.out.println("First name: "+ firstName1+firstName.substring(1, firstName.length()));
        System.out.println("Last name: "+ lastName1+lastName.substring(1, lastName.length()));;
        System.out.println("Domain: "+ domain);
        System.out.println("Top-Level Domain: "+ topDomain);

    }
}