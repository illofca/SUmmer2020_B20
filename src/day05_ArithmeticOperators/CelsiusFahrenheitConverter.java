package day05_ArithmeticOperators;

public class CelsiusFahrenheitConverter {


    public static void main(String[] args) {

        double F = 92;
        double C = (F-32)*5/9;
        System.out.println(C);

        double CELCIUS = 34;  // Convert from Celsius to Fahrenheit
        double FAHRENHEIT = 9*CELCIUS/5+32;
        System.out.println(FAHRENHEIT);


        double c = 25;
        double f = 9*c/5+32;
        System.out.println(f);



    }
}