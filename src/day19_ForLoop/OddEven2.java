package day19_ForLoop;

public class OddEven2 {
    public static void main(String[] args) {

        for(int i = 0; i <= 50; i++){

            if(i%2 == 0){// will print even numbers, to print odd numbers change == to !=;
                continue;
            }
            System.out.print(i+" ");
        }
    }

}
