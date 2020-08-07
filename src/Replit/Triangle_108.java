package Replit;

import java.util.Scanner;

public class Triangle_108 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner ( System.in );
        int n = scan.nextInt ( );

        for (i = 1; i <= n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print ( "*" );
            }
            System.out.println ( );

        }
    }
}



/*
 for (int j = 1; j <= 7; j++) {

            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
 */