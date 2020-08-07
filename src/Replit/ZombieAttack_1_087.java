package Replit;

import java.util.Scanner;

public class ZombieAttack_1_087 {
    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in );
        int inhabitants = scan.nextInt ( );

        int day = 0;
        while (inhabitants>0) {
            System.out.println("Day" + day +" [" + inhabitants +"]");
            inhabitants /= inhabitants;
            day++;

            System.out.println ( "---- EXTINCT ----" );
                break;
        }
    }
}


