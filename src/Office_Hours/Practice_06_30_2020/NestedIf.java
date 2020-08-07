package Office_Hours.Practice_06_30_2020;

public class NestedIf {
    public static void main(String[] args) {
        int score = 80;

        char grade = ' ';


        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                grade = 'A';
            }
            if (score >= 80) {
                grade = 'B';
            }
            if (score >= 70) {
                grade = 'C';
            }
            if (score >= 60) {
                grade = 'D';

        } else {
                grade = 'I';
            }
            System.out.println(grade); // next line look char as ternary!!!!!!

        }

    }


    }

