package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {

        Integer num = 100; // this does not take any other than int value
        int a = 100;

        byte t = 100;

        int z = t;

        //Integer z2 = t;

        Byte b1 = 50;
        int n1 = b1;

        byte b2 = 40;
        //Integer n2 = b2;

        Integer n3 = new Integer(123); // possible but won't need it

        Double[] arr = new Double[3];
        System.out.println(Arrays.toString(arr));

        int p1 = 300;
        Integer p2 = p1; // Autoboxing, done implicitly

        Integer q1 = 500;
        int q2 =q1; //unboxing, done implicitly

        //Double r1 = 300; // wrapper class is only dedicated to its primitive
        Double r1 = 300.0;
        double r2 = r1; // due to implicit unboxing

        long l1 = 400;
        Long l2 = l1;// due to autoboxing done implicitly

        Float f1 = 100.5f;
        Float f2 = f1; // assigning wrapper to wrapper, neither unboxing nor autoboxing







    }
}
