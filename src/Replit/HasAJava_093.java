package Replit;

import java.util.Scanner;

public class HasAJava_093 {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner ( System.in );
        String word = scan.next ( );


        for (int i=0; i<word.length ()-3;i++){
            if(word.substring ( 0 , 4 ).equalsIgnoreCase ( "java" ) || word.substring ( 1 , 5 ).equalsIgnoreCase ( "java" )) {
                exists = true;

                }else{
                exists=false;


            }
        }System.out.println ( exists );

    }
}
