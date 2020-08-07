package day06_ComparisonOperators;

public class Swap1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int c = b; // c=15

        b = a; //b=10
        a = c; //a=15

        System.out.println(a);
        System.out.println(b);

        int d = 35;
        int e = 3;

        int f = e; //f=3

        e = d; //e=35
        d = f; // d= 3

        System.out.println(d);
        System.out.println(e);

        int x = 1;
        int y = 3;

        int z = y; // 3

        y = x;
        x = z;

        /*once y degerini bosaltmak icin z degeri olustur ve z degerini y degerine esitle - su and y degeri bos (z degeri ile ayni)
          sonra x degerini y degerine tasi ==> x=y
          sonra z  tasidigimiz y degerini x degerine tasi         */

        System.out.println(x);//3
        System.out.println(y);//1

        int j = 10;
        int k = 20;

        j = j+k;
        k = j-k;
        j = j-k;

        System.out.println(j);
        System.out.println(k);






    }
}
