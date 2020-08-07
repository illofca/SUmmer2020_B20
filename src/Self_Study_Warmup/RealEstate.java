package Self_Study_Warmup;

import java.util.Scanner;

public class RealEstate {

    public static void main(String[] args) {
        //DO NOT CHANGE
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your property type:");
        houseType = scan.nextLine();

        if (houseType.equalsIgnoreCase("Condo")) {
            propertyPrice = 50_000;
        } else if (houseType.equalsIgnoreCase("Townhouse")) {
            propertyPrice = 75_000;
        } else if (houseType.equalsIgnoreCase("Single Family Home")) {
            propertyPrice = 95_000;
        } else {
            propertyPrice = propertyPrice;
        }

        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        for (int i = 1; i <= numberOfBedrooms; i++) {
            propertyPrice += 30_000;
        }

        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        if (houseType.equalsIgnoreCase("Condo")) {
            System.out.println("Backyard is not available for condo!");
        }else if    (backyard == true ) {
            propertyPrice += 5_000;
        } else {
            propertyPrice=propertyPrice;
        }



        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        if (garage == true) {
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();

            if (garageSpots > 10) {
                System.out.println("Pardon, it's not a public parking!");
            } else {
                propertyPrice += (20_000 * garageSpots);
            }


            System.out.println("How close is metro station?");
            metroAccessibility = scan.nextFloat();
            if (metroAccessibility <= 1) {
                propertyPrice += 10_000;
            } else if (metroAccessibility > 1 && metroAccessibility < 3) {
                propertyPrice += 5_000;//works
            } else {
                propertyPrice = propertyPrice;
            }


            System.out.println("How close is highway?");
            highwayAccessibility = scan.nextFloat();

            if (highwayAccessibility <= 1) {
                propertyPrice += 15_000;
            } else if (highwayAccessibility > 1 && highwayAccessibility < 5) {
                propertyPrice += 8_000;
            } else if (highwayAccessibility > 5 && highwayAccessibility <= 20) {
                propertyPrice += 4_000;
            } else {
                propertyPrice = propertyPrice;
            }

            System.out.println("What's the rating of nearest school?");
            schoolScore = scan.nextFloat();
            if (schoolScore >= 8 && schoolScore <= 10) {
                propertyPrice += 45_000;
            } else if (schoolScore >= 4 && schoolScore < 8) {
                propertyPrice += 20_000;
            } else {
                propertyPrice += 5_000;
            }

            System.out.println("Does any of your family members smoking?");
            smoking = scan.nextBoolean();
            if (smoking) {
                propertyPrice -= 5_000;

            }

            System.out.println("Market report has been generated.");
            System.out.println("Your estimate market price is: " + propertyPrice + "$");
        }
    }

}


