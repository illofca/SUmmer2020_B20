package day12_Switch_Scanner;

public class Recall {

    public static void main(String[] args) {



int vehicleYear = 2004;



            String recall = ((vehicleYear>= 1996 && vehicleYear<=1998) || (vehicleYear>=2001 && vehicleYear<= 2002) || (vehicleYear>= 2004 && vehicleYear<=2006) || (vehicleYear >= 2015 && vehicleYear <=2017)) ? "Your vehicle needs to be recalled!" : "Your vehicle is fine, enjoy!";


            System.out.println(recall);
    }
}
