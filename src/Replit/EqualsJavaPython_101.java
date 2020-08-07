package Replit;

import java.util.Scanner;

public class EqualsJavaPython_101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String word1 = "java";
        String word2 ="python";
        int countJava=0;
        int countPython=0;

        for(int i = 0; i<=sentence.length()-word1.length(); i++) {
            if (sentence.substring(i , (i+word1.length())).equals(word1)) {
                countJava++;
            }
        }

        for(int i = 0; i<=sentence.length()-word2.length(); i++){
         if(sentence.substring(i, (i+word2.length())).equals(word2)){
                countPython++;
            }
        }
        System.out.println(countJava==countPython);
    }
}

