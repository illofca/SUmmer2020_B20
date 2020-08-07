package Replit;

import java.util.Scanner;

public class Email_076 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String email = scan.next();
        String firstName = "";
        String latName = "";
        String domain = "";

        if(email.contains ( "_" )){
            firstName = email.substring ( 0, email.indexOf ( "_" ));
            latName = email.substring ( email.indexOf ( "_" )+1, email.indexOf ( "@" ) );
            domain = email.substring ( email.indexOf ( "@" ));

            System.out.println (latName+"_"+firstName+domain );

        }else{
            System.out.println (email );
        }
    }
}
