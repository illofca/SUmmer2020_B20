package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {

        String firstName = "Izzet";
        String lastName = "Lofca";
        String fullName = firstName + " " + lastName;
        int age = 51;
        String citizenShip1 = "USA";
        String citizenShip2 = "TURKEY";

        boolean eligibleAge = age>= 18; // 51>=21 ==> true;

        boolean usCitizen = citizenShip1 == "USA" || citizenShip2 == "USA";
                            //  "USA" == "USA"    || "USA" == "TURKEY"
                            //        true        ||        false
                            //                  true
        boolean eligibleToVote = eligibleAge && usCitizen; // true && true

        System.out.println("Is " + fullName + " eligible to vote : " + eligibleToVote); // true





    }


}
