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
public class Vote {

    public static void main(String[] args) {

        int age = 35;
        boolean usCitizen = true;
        if(age >= 18 && usCitizen){
            System.out.println("Eligible to vote");
    } else { // it is only usable if there are only two options available
            System.out.println("Not Eligible to vote");
        }

    }
}
