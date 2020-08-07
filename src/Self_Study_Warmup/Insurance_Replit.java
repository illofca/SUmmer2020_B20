package Self_Study_Warmup;

import java.util.*;

public class Insurance_Replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";




        System.out.println("Enter your name");
        name = scan.nextLine();


        System.out.println("Do you have a US driver license?");
        String driversLicense = scan.next();
        if (driversLicense.equalsIgnoreCase("No")) {
            System.out.println("Invalid data!");
            System.exit(0);
        }


        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        if (zipCode == 20910 || zipCode == 20740) {
            premium += 60;
        } else if (zipCode == 22102 || zipCode == 22103) {
            premium += 30;
        } else {
            premium += 50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();

        if (vehicleOwnership.equalsIgnoreCase("Owned")) {
            premium += 10;
        } else {
            premium += 20;
        }



        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();

        if (vehicleUsage.equalsIgnoreCase("Business")) {
            premium += 50;
        } else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
            premium += 10;
        } else if (vehicleUsage.equalsIgnoreCase("Commute")) {
            premium += 20;


            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = scan.nextInt();
            premium += 5 * daysDrivenToWorkOrSchool;

            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            premium += milesToWorkOrSchool * 1;
        }


        System.out.println("How old are you?");
        int age = scan.nextInt();

        if (age < 16) {
            System.out.println("Invalid data!");
            System.exit(0);

            if (age>16 && age < 18) {
                premium *= 20;
            } else if (age>=18 && age <= 21) {
                premium *= 6;
            } else if (age>21 && age < 25) {
                premium *= 2;
            }else{
                premium=premium;
            }
        }

        System.out.println("How many years you've been driving?");
        int experience = scan.nextInt();
        int result = age - experience;

        if (result >= 16 && experience > 0) {
            premium -= experience * 5;
        } else {
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        String accidents = scan.next();
        if (accidents.equalsIgnoreCase("Yes")) {
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium += premium * 0.2 * accidentsAmount;
        }

        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
        if (continuousInsurance.equalsIgnoreCase("No")) {
            premium *= 2;
        }


        scan.nextLine();

        System.out.println("What is the highest level of education you have completed?");
        education = scan.nextLine();
        if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")) {
            premium -= premium * 0.05;
        } else if (education.equalsIgnoreCase("Doctors")) {
            premium -= premium * 0.10;
        } else if (education.equalsIgnoreCase("Less than High School")) {
            premium += premium * 0.05;
            education = education.replaceAll("\\s", "");
        }


        referenceNumber = name.substring(0, 2) + age + name.substring(name.length() - 2) + zipCode + education;

        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);
        System.out.println("Reference number: " + (referenceNumber).toUpperCase());
    }
}




