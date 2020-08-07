package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Diving_132 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        float sum = 0;
          for (int i = 0; i <= 6; i++) {
              System.out.println("Enter score for judge "+(i+1)+":");
              score[i] = input.nextFloat();
              sum += score[i];
          }
          System.out.println("Enter difficulty");
          float dif = input.nextFloat();
          Arrays.sort(score);
          float total = (sum*dif)*6/10;
                // FINAL OUTPUT
                System.out.printf("Total: %.2f" , total);

            }
        }




//5
//3
//8
//7
//6
//5
//4
//3.6