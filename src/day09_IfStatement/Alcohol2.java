package day09_IfStatement;
/* if & else: only if there are two possibilities (not less or not more)
			if(Condition){
				statement1

			}else{  // unless, opposite of if condition
				statement2

			}

			statement1: if condition is true
			statement2: if condition is false

			ONLY ONE OF THE BLOCKS GETS EXECUTED
 */
public class Alcohol2 {
    public static void main(String[] args) {

        int age = 21;

        if(age >= 21){
            System.out.println("You can buy alcohol");
        }else{
            System.out.println("You cannot buy alcohol");
        }

        System.out.println("=======================");

        int num = 5;

        if (num%2 !=0){
            System.out.println(num+" is odd");
        }else{
            System.out.println(num+ " is even");
        }
    }


}
