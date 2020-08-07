package day21_Loops;
/*
write a program that can divide two numbers without using / & % operators and retuns the devision and remainder

            ex:

                input:  10

                        3

                0utput: 3 with a remainder of 1

                10 - 3 = 7
                7 - 3 = 4
                4 -3 = 1
 */
public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 20;
        int b = 6;
        if(b==0){ //because no number is divisible by 0, we should mention this line not to get compile/result error
            System.out.println("Invalid Input");
            System.exit(0); // forcefully terminating the program
        }

        int count = 0; //3 times  6 will be substracted from 20


        while(a >= b){
            a -= b;
            count++;
        }
        System.out.println("Result: "+count+" with a remainder of "+ a);


    }
}
