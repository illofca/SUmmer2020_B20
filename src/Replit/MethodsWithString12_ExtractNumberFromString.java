package Replit;

import java.util.Scanner;


public class MethodsWithString12_ExtractNumberFromString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(extractNum(scan.nextLine()));

    }public static String extractNum(String s) {


        String sDigit = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sDigit += s.charAt(i);
            }

        }
        return sDigit;

    }


}
