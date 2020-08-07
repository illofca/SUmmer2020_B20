package Replit;

import java.util.Scanner;

public class CountHi_098 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String noHi = str.replaceAll("hi", "");

        System.out.println(((str.length())-(noHi.length()))/2);

    }
}
