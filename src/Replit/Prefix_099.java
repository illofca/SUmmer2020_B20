package Replit;

import java.util.Scanner;

public class Prefix_099 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        String noPrefix = str.replaceAll(str.substring(0 , n) , "");

        int count = (str.length()-noPrefix.length()) / n;
        if (count > 1) {

            System.out.println("true");

        } else {

            System.out.println("false");

        }
    }
}