package day32_MethodOverloading;

import java.util.Scanner;

public class formatFullName {
    /*
    fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String last = scan.nextLine();
/*
       first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
       // converts to first char to upper case      converts rest of the chars to lower csae

        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first+" "+ last;


 */
        String fullName = formatFullName(first, last);
        System.out.println(fullName);

    }
    public static String formatFullName(String first, String last) {
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        String fullName = first+" "+ last;

        return fullName;



    }



}
