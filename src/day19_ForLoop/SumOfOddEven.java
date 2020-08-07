package day19_ForLoop;
/*     3. write a program that can calculate the sum of all the even numbers between 1 ~ 100

    4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
*/
public class SumOfOddEven {
    public static void main(String[] args) {
        //Task: 03:
        // 0 2 4 6 8 10..

        int sumOfEven = 0;
/*

        for(int i=0; i<=100; i += 2){
            sumOfEven += i;

    */
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {

            }

            System.out.println(sumOfEven); //if this print statement would be in the body it would print all additions and the last one at the end

            System.out.println("=============================");

            // Task: 04
            // 1 3 5 7 9 ... 99


            int sumOfOdd = 0;

         /*   for (int i = 1; i <=99; i +=2){
                sumOfOdd +=1;

          */

            for(i = 0; i<= 100; i++){
                if(i % 2 !=0){
                    sumOfOdd = sumOfOdd + i; //sumOfOdd +=i
                }

            }
            System.out.println(sumOfOdd);
        }


    }
}
