package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
write a program that can find the unique characters from a string
                        DO NOT use nested loop
                        "ABABCDEE"
                        output: C D

 */
public class Uniques {
    public static void main(String[] args) {
        String str = "AAABCCCCDF";
        String uniques = "";

        ArrayList<String> list = new ArrayList<>();
        list.addAll( Arrays.asList( str.split("") )  )  ;


        for( String each : list){
            int count = Collections.frequency(list, each);
            if(count == 1){
                uniques += each;
            }
        }


        System.out.println(uniques);





    }
}