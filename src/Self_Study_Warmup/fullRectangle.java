package Self_Study_Warmup;

public class fullRectangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++)
            System.out.println("        * * * * * *");

        System.out.println("=============================");

        for (int k = 1; k <= 6; k++)
            System.out.print("* ");

        System.out.println();

        for (int l = 1; l <= 10; l++)
            System.out.println("*         *");

        for (int j = 1; j <= 6; j++)
            System.out.print("* ");
        System.out.println("\n=========================");

        int sum = 0;
        for (int num = 1; num <= 100; num++) {
            sum = sum + num;
        }System.out.print(sum);

        int sum1=0;
        for(int i =1; i <= 100; i++){
            sum1 = sum1 + i;

        }
        System.out.println("\nSum of all numbers between 1 and 100 is "+sum1);

        System.out.println("=================================");

        int sumOdd = 0;
        for (int num2 = 1; num2 <= 100; num2=num2+2) {
            sumOdd = sumOdd + num2;
        }System.out.print(sumOdd);
    }
}

