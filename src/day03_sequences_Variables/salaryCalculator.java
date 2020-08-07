package day03_sequences_Variables;

public class salaryCalculator {
    public static void main(String[] args) {



       /* salary after tax assignment
        variables: salary, tax
        totalSalary = salary * tax;
        salaryAfterTax = salary - tatolTax


        */

    int salary = 100000;
    float tax = 0.28f;

    double totalTax = salary * tax; //28000
        double salaryAfterTax = salary - totalTax; //72000
        System.out.println("\tsalary    : " + salary + "\n\ttotalTax  : " +  totalTax + "\n\tNet Salary: " + salaryAfterTax);

}
}