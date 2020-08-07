package day10_IfStatements;

public class SDET {
    public static void main(String[] args) {
        int vY = 1995;

        if(vY >= 1995 && vY <=1998 || vY == 2001 || vY == 2002 || vY >= 2004 && vY <= 2006 || vY >= 2015 && vY <= 2017){

            System.out.println("Your vehicle needs to be recalled!");
        } else {
            System.out.println("Your vehicle if fine enjoy!");
        }


    }
}

