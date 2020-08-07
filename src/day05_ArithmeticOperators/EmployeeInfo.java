package day05_ArithmeticOperators;
/*1. create a class named EmployeeInfo
					declare the following variables:
							 firstName
							 lastName
							 gender
							 age
							 companyName
							 jobTitle
							 isFullTime
							 isMarried
							 salary

 */
public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName= "John";
        String lastName= "Daniel";
        char gender = 'M';
        int age = 51; //byte da kullanilabili
        String companyName = "Amazon";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 150_000;

        System.out.println("Employee's full name is: " + firstName+" "+ lastName);
        System.out.println(firstName+" " +lastName+"'s gender is: " + "" + gender);
        System.out.println(firstName+" " +lastName+"'s age is: " + "" +age + " years old");
        System.out.println(firstName+" " +lastName+" works at: " + "" +companyName);
        System.out.println(firstName+" " +lastName+"'s salary is: $" + salary);
        System.out.println(firstName+" " +lastName+" is full time employee: "+""+isFullTime);
        System.out.println(firstName+" " +lastName+" is married: "+""+isMarried);





    }



}
