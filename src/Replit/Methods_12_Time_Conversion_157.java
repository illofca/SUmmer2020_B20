package Replit;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Methods_12_Time_Conversion_157 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("hh:mm a");
       // LocalDateTime time1 = LocalDateTime.of(2019,5,20,16,30);
     //   System.out.println(time1);
        System.out.println(DTFormat);



    }
}
/*


        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a");
        LocalDateTime time1 = LocalDateTime.of(2019,5,20,16,30);
        System.out.println(time1);
        System.out.println(time1.format(DTFormat));
    }
}
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45

*/