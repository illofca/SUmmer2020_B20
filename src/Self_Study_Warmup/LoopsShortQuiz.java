package Self_Study_Warmup;

public class LoopsShortQuiz {
    public static void main(String[] args) {

        int a = 0;
        while (a <= 6) {// a: 2, true a:4, true a:6, true a:8, faalse a:8
            a += 2;
        }
        System.out.println(a);

        System.out.println("=========================================");

        int i = 0;
        int j = 7;

        for (i = 0; i < j-1; i += 2) {// for loop checks condition first, then executes statement, then iterates ==> i: 0 2 4
            System.out.println(i+" ");
        }
        System.out.println();
        System.out.println(i);

        System.out.println("=================================");

        for (int k = 0; k <= 4; ) {
            k++; //k: 1 2 3 4 5
            System.out.println(k+"");// 1 2 3 4 5
        }

        System.out.println();
        int z = 5; //5 + 5 + 4 + 3 + 2 + 1 = 20
        for(int q = 5; q > 5; q--){//q: 5 4 3 2 1 0 false
            z += q;
        }

    }


    }

