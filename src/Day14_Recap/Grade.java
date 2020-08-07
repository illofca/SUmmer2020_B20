package Day14_Recap;

import java.util.Scanner;
/*
                    90 <= score <= 100 ==> Excellent
                    80 <= score < 90 ==> Great
                    70 <= score < 80 ==> Good
                    60 <= score < 70 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry
 */

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();
        scan.close(); // closes the scanner, perfomance of the code will be much more faster

        String result ="";


        if(score >= 0 && score <= 100){
            if(score>=90){
                result = "Excellent";
            }else if(score>=80){
                result ="Great";
            }else if(score>+70){
                result = "Good";
            }else if(score>=60){
                result = "Passed";
            }else{
                result = "Failed";
            }



        }else{
            result = "invalid Entry";

        }
        System.out.println(result);

    }
}
