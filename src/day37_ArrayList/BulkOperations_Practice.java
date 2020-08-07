package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");



        // verify that the names Ulku, Busra are contained in students list
        boolean r1 = students.containsAll(  Arrays.asList("Ulku", "Busra", "Muhtar")   );

        System.out.println(r1);

        System.out.println("============================");

        ArrayList<String> group1 = new ArrayList<>();
        // add all student names in your group

        group1.addAll(Arrays.asList("Izzet", "Muhtar", "Nadir", "Asiya", "Saim"));

        // verify your mentor and a student's name contained in the list
        boolean r2 = group1.containsAll(Arrays.asList("Izzet", "Saim"));
        System.out.println(r2);


        System.out.println("===========================");

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Izzet", "Ali","Veli","Ilyas", "Kadir"));

        System.out.println(employees);

        employees.retainAll(Arrays.asList("Veli"));
        System.out.println(employees);
;


    }

}