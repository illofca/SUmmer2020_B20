package day10_IfStatements;


public class Triangle {
    public static void main(String[] args) {


        int ang1 = 75;
        int ang2 = 85;
        int ang3 = 25;
        int sum = ang1 + ang2 + ang3;

        if (sum == 180){
            System.out.println("This is a triangle");
        }else{
            System.out.println("This is not a triangle");
        }


    }
}
