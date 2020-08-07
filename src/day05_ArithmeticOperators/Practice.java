package day05_ArithmeticOperators;

public class Practice {

    public static void main(String[] args) {

        int a = 5 + 2 * 4; // 13
        System.out.println(a);

        int b = 10 / 2 -3 ;
        System.out.println(b);

        int c = 8 + 12 * 2 - 4; //8 + 24 -4 = 28
        System.out.println(c);

        int d = 4 + 17 % 2 - 1; //4 + 1 -1 = 4
        System.out.println(d);

        int e = 6 - 3 * 2 + 7 - 1;
        System.out.println(e);

        System.out.println(5+5/5);//6
        System.out.println((5+5)/5); //2
        System.out.println((5+5) / 5.0);  //2.0

        int y = 5 * 2 /3 + (4 * 3); // 5*2/3+12
                                    // 10/3+12  ==> 10/3 without remainder (without decimal, to make it accurate look below)
                                    //3+12 =15
        System.out.println(y);

        double z = 5 * 2 / 3.0 + (4 * 3); // look at the difference with below int one
        System.out.println(z);

        double v = 5 * 2 /3 + (4 * 3);
        System.out.println(v);


        double t = 10/3;
        System.out.println(t);





    }
}


