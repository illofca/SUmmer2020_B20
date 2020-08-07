package day06_ComparisonOperators;

public class implicit_explicit {

    public static void main(String[] args) {
        short s1 = 100;
        long l1 = s1; // implicit casting: automatically

        long l2 = (long)s1; // though there is no need, if we implicit manually

        int I1 = 300;
        double D1 = I1; // 300.0 because implicit casting is done to double data type

        double D2 = (double) I1;

        System.out.println("==========================================");

        double d1 = 400.5555;
        int i1 = (int)d1; //400

        System.out.println(i1);

        long L1 = 4400;
        short sh1 = (short) L1;

        System.out.println(sh1);

        int n1 = 1000;
        byte b1 = (byte)n1;

        System.out.println(b1); // -24 ==> because byte cannot contain larger than 127

        double m1 = 34.5;
        float f1 = (float) m1; // since 34.5 is in the range of float we will get 34.5, it it would be a number out of range  than it would give an unexpected number




    }

}
