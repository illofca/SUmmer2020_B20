package day07_Unary_Shorltland;

public class LeapYear {

    /*Warm Up tasks:
	1. create a class called day07_Unary_Shorltland.LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
		Ex:
			year = 2020  ==> short;

			day07_Unary_Shorltland.LeapYear =true/false;

		output:
			2020 is leap year: true

			Assume that any year that can be divisble by 4 is leap year
*/
    public static void main(String[] args) {

        int year = 2020; // boolean: ==, =, !=, <=, >=, <, >
        boolean result = year % 4 == 0;

        System.out.println("Year" + year + "is a leap year: " + result); // 2020 is a leap year : true; 2021 is a leap year : false
        System.out.println ( 10/3.0 );

        System.out.println (  (int)(10.0/3)   );








    }




}
