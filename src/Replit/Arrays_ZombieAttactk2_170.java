package Replit;

import java.util.*;


public class Arrays_ZombieAttactk2_170 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
        int count = 0, sum = 0;
        System.out.println("Day " + count + " " + Arrays.toString(inhabitants));



        do {
            for (int i = 0; i < inhabitants.length; i++) {
                if (i < inhabitants.length - 1) {

                    if (inhabitants[i] != 0 && inhabitants[i + 1] == 0) {
                        inhabitants[i] /= 2;
                    }
                    if (inhabitants[i] == 0 && inhabitants[i + 1] != 0) {
                        inhabitants[i + 1] /= 2;
                        i += 1;
                    }
                }
            }

            sum = 0;
            for (int each : inhabitants)
            sum += each;
            count++;

            System.out.println("Day " + count + " " + Arrays.toString(inhabitants));

        } while (sum > 0);
        System.out.println("---- EXTINCT ----");


    }

}



