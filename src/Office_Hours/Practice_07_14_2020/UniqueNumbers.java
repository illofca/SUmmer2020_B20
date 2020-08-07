package Office_Hours.Practice_07_14_2020;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1 , 1 , 2 , 3 , 3 , 1, 4, 7, 7, 8, 9, 9};

        for (int b : arr) {


            int count = 0;
            for (int each : arr) {
                if ( each == b ) {
                    count += 1;
                }
            }
            if ( count == 1 ) {
                System.out.print ( b+", " );
            }
        }
    }
}
