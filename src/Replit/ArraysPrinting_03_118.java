package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrinting_03_118 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 6 items
        //and print three neibouring items at a time till last item
        //write your code below



       //     for (String each:arr) {
                for (int i=0;i<arr.length-2;i++){

                    String adjacent3 = arr[i]+" , " + arr[i+1] + " , " +arr[i+2];

                    System.out.println(adjacent3);

        }
    }
}

