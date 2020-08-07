package day09_IfStatement;

public class Median {

    public static void main(String[] args) {



        double a = 100;
        double b = 200;
        double c = 300;

        double med = 0;

        boolean aIsMed = (a>b && a<c) || (a<b && a>c);
        boolean bIsMed = (b>c && b<a) || (b<c && b>a);
        boolean cIsMed = !aIsMed && !bIsMed;



        if(aIsMed){
            med=a;
        }
        if(bIsMed){
            med=b;
        }
        if(cIsMed){
            med=c;
        }
        System.out.println("\"" + med + "\" is the median number");


    }
}
