package Office_Hours.Practice_06_30_2020;

public class If_Practice {
    public static void main(String[] args) {

        int num = 304;

        String result ="";

        if(num%2==0){
           result = num+" is even number";
        }
        if(num%2 !=0){
            result = num+" is odd number";
        }
        System.out.println(result);

        //Ternary; shortcut of if/else statement
        // ?; if statement ==> needs a condition to be expressed,
        // condition works without (), but it is not good to use
        // : else statement

        String result2 = (num%2==0) ? num + " is even number" : num+ (" is odd number");
        System.out.println(result2);




    }
}
