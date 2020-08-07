package day11_NestedIf_Ternary;

public class EligibleTOVOte {

    public static void main(String[] args) {

        int age = 17;
        String citizen = "USA";

        String result = "";

        String result2 = (age>=18 && citizen == "USA") ? "Can vote" : "Cannot vote";
        System.out.println(result2);

        System.out.println("============================");

        int n1 = 100;
        int n2 = 200;
        String r = (n1 == n2) ? "Equal" : "Not Equal";
        System.out.println(r);


        System.out.println("============================");

        int age1 = 17;
        String citizen1 = "USA";

        String result3 = "";

        String reult4 = (age1>=18 && citizen1 == "USA") ? "Can vote" : "Cannot vote";
        System.out.println(result3);
    }
}
