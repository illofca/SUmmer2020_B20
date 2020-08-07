package day11_NestedIf_Ternary;

public class NestedIf_Practice2 {
    public static void main(String[] args) {


        int day = 1;
        boolean validNumber = day >= 1 && day <= 7;
        String result = "";

        if (validNumber) {

       /*     if (day == 7) {
                result = "Sunday";
            } else if (day == 6) ;
            {
                result = "Saturday";
            }
            if (day == 5) {
                result = "Friday";
            } else if (day == 4) ;
            {
                result = "Thursday";
            }
            if (day == 3) {
                result = "Wednesday";
            } else if (day == 2) ;
            {
                result = "Tuesday";
            }
            if (day == 1) {
                result = "Monday";
            }*/

        result = (day == 7) ? "Sunday" : (day==6) ? "Saturday" :(day== 5) ? "Friday" :(day ==4) ? "Thursday" : (day ==3) ? "Wednesday" : (day == 2) ? "Tuesday" : "Monday";

        } else {//invalid number
             result = "Invalid";
            }
        System.out.println(result);
        }
    }


