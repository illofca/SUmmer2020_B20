package day28_Recap;

import java.util.Scanner;

/*
write a program return the frequency of a word from a string

            ex:

                str = "JavajavaJAVA";

                word = "java";

                output:

                    3

        do not use same the approach we did in last office hour


 */
public class FrequencyOfWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        String str = scan.nextLine();
        String word = scan.next();
        int l = word.length();
        //            0123456789
        int count = 0;

        for(int i = 0; i <= str.length()-3; i++){ // not length()-1 but length()-3 not to get out of ban
            if(str.substring(i, i+l).equalsIgnoreCase(word)){
                count++;
            }
        }

        System.out.println(count);
    }
}
