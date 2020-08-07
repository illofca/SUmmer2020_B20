package day09_IfStatement;
/* Task01:
	 write a program that can check if number is positive negative or equals to zero.

	 	for example:
			num  = 1

			prints:
				1 is positive number

			num = -6

			print:
				6 is negative number


			num = 0

			print:
				zero */

public class PositiveNegativeZero {
    public static void main(String[] args) {

        int num = 0;

        if (num>0){
            System.out.println(num+ " is a positive number.");
        }

        if (num<0){

            System.out.println(num+ " is a negative number");
        }

        if (num == 0){

            System.out.println("Number is \"0\"");
        }

    }




}
