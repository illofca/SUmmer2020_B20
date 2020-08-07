package day11_NestedIf_Ternary;

public class NestedIf_Grade {
    public static void main(String[] args) {


        /*int score = 175;
        String grade = "";
        if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            grade = "D";
        } else if(score >= 0 && score <=59){
            grade = "F";

        }else{
            grade = "Invalid Score";
        }
        System.out.println("Student's grade is " + grade);*/

        int score = 55;
        String result = "";
        if (score >= 0 && score <= 100){
            /*if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else {
                result = "F";
            }*/
            result = (score >=90)? "A" : (score>= 80)? "B" : (score>=70)? "C" : (score>= 60)? "D" : "F";
        }else {
                result = "Invalid";
            }

            System.out.println(result);


    }
}