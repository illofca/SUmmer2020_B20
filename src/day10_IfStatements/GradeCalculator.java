package day10_IfStatements;
/*
grade: int score = 95;
    90 ~ 100 ==>A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~69 ==> D
    otherwisw ==> F
*/
public class GradeCalculator {
    public static void main(String[] args) {

        int score = 175;
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
        System.out.println("Student's grade is " + grade);
    }
}
