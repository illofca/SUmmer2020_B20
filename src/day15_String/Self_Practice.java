package day15_String;

import java.util.Scanner;

public class Self_Practice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your favorite song's name");
        String sentence = scan.nextLine();
        char ch1 = sentence.charAt(0);
        int l = sentence.length()-1;

        System.out.println("First character of the song is: "+ ch1);
        //System.out.println(l);

        // last index: length of String - 1
        int lastIndexNumber = sentence.length() - 1;

        //System.out.println( lastIndexNumber );

        char lastChar = sentence.charAt(lastIndexNumber);
        System.out.println("Last character of the song is: "+lastChar);

        //concat(Str): concatenation

        String  schoolName = "Cybertek";
        schoolName = schoolName.concat(" School");

        String r1 = "Cybertek" + 123 + 'A'+true; //123
        System.out.println(r1);
      //w  String r2 = "Cybertek"
    }
}
