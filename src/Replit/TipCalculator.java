package Replit;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Split:");
        String split = scan.next();

        System.out.println("Number of people:");
        int numOfPeople = scan.nextInt();

        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();

        System.out.println("Service Quality:");
        String quality = scan.next();



        double poor = 0.05 , fair = 0.1, good = 0.15 , great = 0.2 , excellent = 0.25;

        double totalTip = 0;

        String ppl = (numOfPeople==1)?"&":(numOfPeople==2)?"&&":(numOfPeople==3)?"&&&"
                :(numOfPeople==4)?"&&&&":"&&&&&";
        System.out.println("Number of people entered: " + ppl);



        if (split.equalsIgnoreCase ("Yes")){
            if (quality.equalsIgnoreCase ("Excellent")) {
                 totalTip = checkAmount * 0.25;
            } else if (quality.equalsIgnoreCase ("Great")) {
                totalTip = checkAmount * great;
            } else if (quality.equalsIgnoreCase ("Good")) {
                totalTip = checkAmount * good;
            } else if (quality.equalsIgnoreCase ("Fair")) {
                totalTip = checkAmount * fair;
            } else{
                totalTip = checkAmount * poor;
            }

        }
        System.out.println("Total to pay: " + (checkAmount + totalTip));
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: "+ (checkAmount + totalTip) / numOfPeople);
        System.out.println("Tip per person: "+ (totalTip / numOfPeople));

    }
}