package day09_IfStatement;

public class Alcohol {
    public static void main(String[] args) {
/* if statement: conditional statements

		single if statement: for one condition

				if(boolean){
					codes
				}

		codes: gets executed if boolean is true
 */

        int age = 20;
        boolean hasID = true;

        boolean eligible =hasID && age >= 21;

       String result = "";

        if (eligible == true) {
           // System.out.println("Is it legal to sell alcohol to this " + age + " years old person? : " + eligible);
            result = "Eligible to buy alcohol";
            System.out.println(result);


        }
        if (eligible == false){
           // System.out.println("Go buy your milk");
            result = "You are not old enough to buy alcohol";
            System.out.println(result);

        }
    }
}
