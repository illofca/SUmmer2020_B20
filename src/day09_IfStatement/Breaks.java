package day09_IfStatement;
/*if & else: only if there are two possibilities (not less or not more)
			if(Condition){
				statement1

			}else{  // unless, opposite of if condition
				statement2

			}

			statement1: if condition is true
			statement2: if condition is false

			ONLY ONE OF THE BLOCKS GETS EXECUTED
*/
public class Breaks {

    public static void main(String[] args) {

        String isItBreakTime = "Yes";
        if(isItBreakTime == "Yes") {
            System.out.println("Take 15 minutes break!");

        }else{
            System.out.println("Continue to the class");
        }


        System.out.println("===============================");

        int a = 300;
        int b = 200;

        if(a>b){
            System.out.println(a+ " is greater");
        }else{
            System.out.println(b+ " is greater");
        }
    }



}
