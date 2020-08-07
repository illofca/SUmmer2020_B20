package day07_Unary_Shorltland;

public class Post_VS_Pre {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a);
        System.out.println(a);

        System.out.println("=======================");

        int b = 10;
        System.out.println(b++);
        System.out.println(b);

        System.out.println("=====================");

        int c = 25;
        int d = c++; // d = 25; c=26;

        System.out.println(c);
        System.out.println(d);

        System.out.println("========================");
        int e = 25;
        e++;
        System.out.println(e);

        System.out.println("====================");

        int x = 8;
        int y = x--;
        System.out.println(y);
        System.out.println(x);

        System.out.println("==================================");

        int m = 2;
        int n = m++;
        System.out.println(n);
        System.out.println(m);

        System.out.println("==============================");

        int A = 1;
        A = -A-- + A++ / -A--  * --A;

        //A= -1  + 0   / -1    *  -1
        //A= -1  + 0 * -1
        //A= -1 + 0 = -1

        System.out.println("==================");

        int B = 50;
        B = --B + B++ + B-- + B++;
        //B= 49 + 49  + 50  +  49;

        System.out.println(B);


        System.out.println("=============================");





    }



}
