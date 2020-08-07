package Replit;

import java.util.Scanner;

public class CatsAndDogs_088 {
    public static void main(String[] args) {


        Scanner scan = new Scanner ( System.in );
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next ( );
        word = word.toLowerCase ( );

        for (int i = 0; i <= word.length ( ) - 3; i++) {

            if ( word.substring ( i , i + 3 ).equals ( "dog" ) ) {
                countOfDogs++;

            } else if ( word.substring ( i , i + 3 ).equals ( "cat" ) ) {
                countOfCats++;
            }

        }
        boolean isSame = countOfCats == countOfDogs ? true : false;

        System.out.println (isSame );


    }
}