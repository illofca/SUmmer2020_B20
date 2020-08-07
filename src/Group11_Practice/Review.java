package Group11_Practice;

public class Review {
    public static void main(String[] args) {
      /* Write a program to determine whether a student is eligible to apply for the scholarship
   using the Nested IF & Ternary.
if a student has a diploma, print eligible; otherwise print not eligible
if gpa is less than 3.4, print Not enough gpa to apply
if gpa is greater than or equal to 3.8 and less than or equal to 4, print Apply for Premium VIP Scholarship
if gpa is greater or equal to 3.6 and less than 3.8, print Apply for Premium Scholarship
if gpa is greater or equal to 3.4 and less than 3.6, print Apply for Standard Scholarship
 */

        boolean hasDiploma = !false;
        double gpa = 3.8;
        if (hasDiploma == true) {
            String result = (gpa >= 3.8 && gpa <= 4) ? "Apply for Premium VIP Scholarship" : (gpa >= 3.6 && gpa <= 3.8) ? "Apply for Premium Scholarship" : "Not eligible" ;
            System.out.println(result);
        }


    }
}
