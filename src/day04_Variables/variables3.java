package day04_Variables;

public class variables3 {

    public static void main(String[] args) {
        // school name : Cybertek School

        String schoolName = "Cybertek School";

        System.out.println(schoolName);

        /* task: declare the following variables
        employeeName
        employeeID
        jobTitle
        salary
        gender (char)
        isFullTime (boolean)
         */

        String employeeName = "Izzet";
        int employeeID = 123456; // if there is letter in employeeID use String and ""
        String jobTitle = "Senior SDET";
        double salary = 180_000.50;
        char gender = 'M';
        boolean isFullTime = true;

        System.out.println(employeeName);
        System.out.println(employeeID);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(gender);
        System.out.println(isFullTime);
        System.out.println("=============================================");

        //System.out.println(+ employeeName, + \nemployeeID + \njobTitle + \nsalary + \ngender);
// concetenation
        System.out.println("Employee Name    :" + employeeName);
        System.out.println("Employee ID      :" + employeeID);
        System.out.println("Job Title        :" + jobTitle);
        System.out.println("Salary           :" + salary + " USD");
        System.out.println("Gender           :" + gender);
        System.out.println("Full Time        :" + isFullTime);
        System.out.println("====================================================================");




    }
}
