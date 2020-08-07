package Self_Study_Warmup;



public class shortCodes {
    public static void main(String[] args) {

    int age =28;
    int experience = 3;
    int premium = 0;
    int result = 0;


        System.out.println("How many years you've been driving?");

        result = age - experience;

        if (result >= 16 && experience > 0) {
            premium -= experience * 5;
           System.out.println(premium);
        } else {
            System.out.println("Invalid data!");
            System.exit(0);
        }
    }
}
