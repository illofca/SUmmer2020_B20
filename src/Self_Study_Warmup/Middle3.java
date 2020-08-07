package Self_Study_Warmup;

import java.util.Scanner;

public class Middle3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if (word.length()% 2 != 0 && word.length() >= 5) {
            char ch2 =  word.charAt((word.length() - 1) / 2);
            char ch1 = word.charAt((word.length() - 1) / 2 - 1);
            char ch3 = word.charAt(((word.length()-1)/2)+1);

            System.out.println(""+ch1+ch2+ch3);
        } else {
            System.out.println("invalid");
        }

    }
}