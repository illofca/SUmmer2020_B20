package day08_LogicalOperators;

public class IfStatement {
    public static void main(String[] args) {

        int a = 100;
        int b = 100;


        if (a > b) {
            System.out.println(a + " is the largest number");
        }

            if (b > a) {
                System.out.println(b + "is the max number");
            }

            if (a == b) {

                System.out.println("Both are equal");


            }



            System.out.println("===========================================");


            int age = 21;

            boolean isItLegalToSellAlcohol = age >= 21;
            if (age >= 21) {
                System.out.println("Is it legal to sell alcohol to this " + age + " years old person? : " + isItLegalToSellAlcohol);

            }

        System.out.println("======================================");
            boolean breakTime = true;

            if(breakTime == true) {
                System.out.println("Take 15 minutes break!");
            }
            if(breakTime == false){

                System.out.println("Keep Studying");
            }






        }
    }

