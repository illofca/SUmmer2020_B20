package Replit;

import java.util.Scanner;

public class PrintVowels_106 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        String wordExpected ="";

        for(int i = 0; i<=word.length()-1; i++){
        if(word.charAt(i) =='a'||word.charAt(i) =='a'||word.charAt(i) =='e'||word.charAt(i) =='i'||word.charAt(i) =='o'||word.charAt(i) =='u'){
            wordExpected += word.charAt(i);


        }
    }

        System.out.print(wordExpected);



}
}



