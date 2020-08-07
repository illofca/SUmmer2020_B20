package Replit;

import java.util.Scanner;

public class CountJava_097 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        String word = scan.next();
        word = word.toLowerCase ();
        int count=0;

        for(int i = 0; i<=word.length()-1; i++){
            if(word.contains ("java")){
                count++;
                word=word.replaceFirst ("java", "");

              }
        }

        System.out.println(count);



    }
}

