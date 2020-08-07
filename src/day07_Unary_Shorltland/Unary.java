package day07_Unary_Shorltland;

public class Unary {
    public static void main(String[] args) {


        System.out.println(-1 +  -10); // -1 -10  ==> -11

        System.out.println(-1 - -10); // -1  +  10 ==> 9
        System.out.println("==================================");

        //--;
        int a = 20;
        a = a-1; // 21
        a =a-1; //20
        --a;
        System.out.println(a);

        //++;
        int b = 10;
        // b = b + 1; ==> b=11, instead use ++
        ++b;
        System.out.println(b);
        System.out.println("==================================");
        int x = 100;
        System.out.println(++x);

        int y = 100;
        System.out.println(--y);


        System.out.println("===================================");

        //a++; b--;

        int n = 70;
        n++;
        System.out.println(n);


    }



}
