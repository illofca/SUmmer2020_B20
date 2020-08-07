package WarmupTasks;

public class FullName {
    /*
        1. write a method that can retunr the full name of a person in reugral format

            ex:

                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
     */

    public static void main(String[] args) {
        String a="CYBerteK";
        String b="ScHOol";
        System.out.println(fullName(a,b));
    }
    public static String fullName(String firstName, String lastName){
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        String ch1 = firstName.substring(0, 1).toUpperCase();
        String ch2 = lastName.substring(0, 1).toUpperCase();
        String fullName = "" + ch1 + firstName.substring(1) + " " + ch2 + lastName.substring(1);
        return fullName;
    }
}