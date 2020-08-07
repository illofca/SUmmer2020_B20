package day34_WrapperClass;

public class WrapperClass_Methods {
    public static void main(String[] args) {

        String str = "123";
        int a = Integer.parseInt(str); //123, assigning int to int is neither unboxing nor autoboxing

        System.out.println(str + 1); //1231==> concatenation
        System.out.println(a + 1); //124 ==> addition

        Double[] arr= {0.5, 1.5,2.5, 3.5};

        Double d1 = Double.parseDouble("7.5"); // parse always returns primitive
        //double d2 = 12.5; //primitive
        System.out.println(d1-1);

        String s1 = "true"; // or "TRUE";

        boolean b1 = Boolean.parseBoolean(s1); // parse method automatically ignores case sensitivity and returns primitive

        System.out.println(b1); //true ==> to check whether it is boolean or not just apply ! to b1


        System.out.println("=============Wrapper Class==========================");

        String s2 = "10000.5";
        double d2 = Double.valueOf(s2); //unboxing ==> done automatically // never bother about it, just know the logic

        System.out.println(d2*2);

        String s3 = "FaLSe";
        boolean r2 = Boolean.valueOf(s3); // unboxing => returns wrapper class value and can be assigned to primitive

        System.out.println(r2);





    }



}
