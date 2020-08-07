package day09_IfStatement;

public class Minimum {
    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;

        double min = 0;// we want to assign the maximum number to variable max
                        // we may assign any number here, it hasn't be a 0
        boolean aIsMin = a < b && a < c;

        boolean bIsMin = !aIsMin && b < c; //aIsMin == false && b<c; // b<a && b<c;

        boolean cIsMin = !aIsMin && !bIsMin;//aIsMin == false && bIsMin == false;//c>a && c>b;

        if(aIsMin){
            //System.out.println(a);
            min = a;
        }
        if(bIsMin){
            // System.out.println(b);
            min = b;
        }
        if(cIsMin){
            //  System.out.println(c);

            min = c;
        }
        System.out.println((int)min + " is the minimum number");

    }
}
