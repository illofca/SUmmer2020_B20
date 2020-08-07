package Replit;

import java.util.Scanner;

public class GetSandwich_100 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.next();
        System.out.println("Please enter a word for sandwich");
        String word = scan.next();
        System.out.println(str.indexOf(word)+" and creambreadbutterbreadcream" +
                ""+ str.lastIndexOf(word));

        if (str.indexOf(word) < str.lastIndexOf(word)) {

            System.out.println("You will not get sandwich without "+ word + ", but "+(str.substring(str.indexOf("bread")+5 , str.lastIndexOf("bread"))));

        } else {

            System.out.println("nothing");

        }

    }
}
