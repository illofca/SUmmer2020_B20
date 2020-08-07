package day24_Arrays;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1 , 1 , 2 , 3 , 3,4,4,5,6,6,7,8,9,};

        for (int j = 0; j <= arr.length - 1; j++) {
            //j:0,1,2,3,4

            int num1 = arr[j];//1
            int count = 0; //
            for (int i = 0; i <= arr.length - 1; i++) { // only calculates the frequency of num
                int each = arr[i]; //1  1  2  3 3
                if ( each == num1 ) {
                    count++;
                }
            }


            if ( count == 1 ) {
                System.out.print( num1+" " );
            }

        }
    }
}
