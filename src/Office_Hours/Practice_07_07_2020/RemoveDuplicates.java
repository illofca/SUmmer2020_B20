package Office_Hours.Practice_07_07_2020;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String str = scan.nextLine();


        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {

            String s = "" + str.charAt(i); // s: n, a, l, a, n

            if (result.contains(s)) {
                continue; // skips iteration, jumps to next iteration
            } else {
                result += s;

            }



        }System.out.println(result);
    }
}
