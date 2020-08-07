package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {

        String firstName = "Izzet";
        String lastName = "Lofca";
        String fullName = firstName + " " + lastName;
        int age = 19;
        String citizenShip = "TURKEY";

        boolean eligibleToVote = age >= 18 && citizenShip == "USA";

        System.out.println(fullName + " is eligible to vote: " + eligibleToVote);

        System.out.println("====================================");

      /*  String firstName2 = "Izzet";
        String lastName2 = "Lofca";
        String fullName2 = firstName + " " + lastName;
        int age2 = 19;
        String citizenShip2 = "TURKEY";

        boolean eligibleToVote2 = age >= 18 || citizenShip2 == "USA";

        System.out.println(fullName2 + " is eligible to vote: " + eligibleToVote2);

        System.out.println("=====================================");

        int age3 = 18;
        boolean citizenShip3 = "USA" || "N"; // or "Neutralized"


        boolean isYoung = ageOfAli <= 18 || */
        boolean r8 = true == !false || false ==true;

        System.out.println(r8);

        boolean r9 = !false == false || true == !false;
        boolean r10 = !false == false && true == !false;


        System.out.println(r9);
        System.out.println(r10);




    }
}
