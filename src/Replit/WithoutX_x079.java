package Replit;

import java.util.Scanner;

public class WithoutX_x079 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String word = scan.next();
        boolean firstCh = word.substring(0,1).equalsIgnoreCase("x");
        boolean lastChar = word.substring(word.length()-1).equalsIgnoreCase("x");

        if (firstCh && lastChar) {
            System.out.println(word.substring(1, word.length() - 1));
        }else if(firstCh) {
            System.out.println(word.substring(1));
        }else if(lastChar){
            System.out.println(word.substring(0, word.length()-1));
        }else{
            System.out.println(word);
        }


    }
}
