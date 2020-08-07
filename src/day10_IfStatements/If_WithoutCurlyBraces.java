package day10_IfStatements;

public class If_WithoutCurlyBraces {
    public static void main(String[] args) {
        if(9 > 10){
            System.out.println("Hello"); // if if statement is true than it is executed
        }
            System.out.println("How are you?");// if if statement is false than it is executed


        System.out.println("===============================");

        int num = 100;
        if(num%2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}