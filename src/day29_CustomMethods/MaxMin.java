package day29_CustomMethods;

public class MaxMin {
    /*
    11. write a method that can print out the maximum number from any array of integers
    12. write a method that can print out the minimum number from any array of integers
     */

    public static void main(String[] args) {
        int[] numbers = {1 , 2 , 3 , 4 , 500 , 300 , 5 , 6 , 7 , 8, -200};
        maxNum(numbers);
        minNum(numbers);
    }

    public static void maxNum(int[] arr) {

        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println("Max is: "+max);
    }

    public static void minNum(int[] arr) {

        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println("Min is: "+min);

    }
}
