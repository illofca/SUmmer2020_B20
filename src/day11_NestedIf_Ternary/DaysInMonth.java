package day11_NestedIf_Ternary;

public class DaysInMonth {

    /*  write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)

	 	ex:
	 		month = 3
		output:
			31 days

			month = 4
		output:
			30 days

			month = 13
		output:
			Invalid month

		HINT:
			28 days: 2
			30 days: 4,6,9,11
			31 days: 1,3,5,7,8,10,12 */
    public static void main(String[] args) {
        int month= 2;

        boolean days28 = month==2;
        boolean days30 = month == 4 || month==6 || month== 9 || month== 11;
        boolean days31 = month == 1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12;
        boolean invalid = month < 1 || month > 12;

        String result = "";

        if(days28){
            result  = "28 days";
        }else if(days30){
            result = "30 days";
        }else if(days31){
            result ="31 days";
        }else {
            result="Invalid";

        }
        System.out.println(result);
    }


}
