package day11_NestedIf_Ternary;

public class DayOfTheWeek {
    /* 2. Write an if statement that will print day of the week based on value of the day variable.
		Ex:
			num = 1
		output:
			"Monday"
			num = 8
		output:
			"There is no such a day!"
			num = 3
		output:
			Wednesday */
    public static void main(String[] args) {
        int dayNum = 1;
        String day = "";

        if (dayNum == 11) {
            day = "Monday";
        } else if (dayNum == 2) {
            day = "Tuesday";
        } else if (dayNum == 3) {
            day = "Wednesday";
        } else if (dayNum == 4) {
            day = "Thursday";
        } else if (dayNum == 5) {
            day = "Friday";
        } else if (dayNum == 6) {
            day = "Saturday";
        } else if (dayNum == 7) {
            day = "Sunday";
        } else {
            day = "There is no such a day!";
        }
        System.out.println(day);


    }
}
