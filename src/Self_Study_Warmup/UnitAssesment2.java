package Self_Study_Warmup;

import java.util.Arrays;

public class UnitAssesment2 {
    public static void main(String[] args) {


        String[] words = {"one" , "two" , "three" , "four"};
        String[] other = new String[words.length];
        int index = 0;

        for (String word : words) {
            other[index++] = word+word.length();
        }
        System.out.println(Arrays.toString(other));

        System.out.println("================================");

        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);

        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");

        if (index1 == index2) {
            System.out.println(index1);
        } else {
            System.out.println(index2);

            System.out.println("================================");

        }

    }
}
