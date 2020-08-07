package Replit;

import java.util.Scanner;

public class RepeatSeperator_096 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        String expected = "";
        for (int j =0 ; j < count; j++) {
            if(j < count-1) {
                expected += word + separator;
            }else{
                expected += word;
            }

        }System.out.print(expected);
    }
}

