package Office_Hours.Practice_07_20_2020;
public class Max_2DArray_2 {
    public static void main(String[] args) {

        //        0  1  2    0 1 2 3    0 1  2 3  4
        int[][] arr2D = {{1 , 2 , 3} , {4 , 5 , 6 , 7} , {8 , 9 , 10 , 11 , 12} , {13 , 20 , 32 , 51}};
        //                     0        1              2

        int max = arr2D[0][0];

        for (int[] each1D : arr2D) {
            for (int eachNum : each1D) {
                if (eachNum > max) {
                    max = eachNum;
                }
            }

        }
        System.out.println("Maximum: "+max);
    }
}
