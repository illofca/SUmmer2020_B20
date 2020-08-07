package day11_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {

        int num = 100;
        String result ="";


        String result2 = (num % 2 == 0)? "Even" : "Odd";
        System.out.println(result2);
        System.out.println("===============================");

        int num1 = 100000;
        int num2 = 20;
        int max = 0;

        int max2 = (num1>num2) ? num1 : num2;
        System.out.println(max2);



        System.out.println("=============================");

        int x = 2;
        int y = 2;

        String isEqual = (x==y) ? "Numbers are equal" : "Numbers are not equal";
        System.out.println(isEqual);

    }
}