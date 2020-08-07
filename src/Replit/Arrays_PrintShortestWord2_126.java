package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_PrintShortestWord2_126 {
    /*
    Instructions from your teacher:
Write a program that will find out shortest words in the given string str. If there are few words that are evenly short, print them all. Use split method in order to split str string variable and create an array of strings.  Print array with Arrays.toString() method. Sort array before printing.
Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(", ");
        Arrays.sort(words);
        String result = "";
        int min = words[0].length();

        for (String each : words) {
            if (each.length() < min) {
                min = each.length();

            }

        }

        for (String each : words) {
            if (each.length() == min) {
                result += each+",";
            }

        }

        System.out.println(Arrays.toString(result.split(", ")));
    }
}