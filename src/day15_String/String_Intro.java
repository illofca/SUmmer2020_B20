package day15_String;

//import java.lang.String; // this package is automatically imported,
                         // no need to give, it's most special package,
                        // rest of the packages we have to give explicitly
//import java.util.Scanner;

public class String_Intro {
    public static void main(String[] args) {
        String str = "Cybertek";
       // Scanner input = new Scanner(System.in);

        String name = "Cybertek";
        String name2 = new String("Cybertek");

        String  s1 = "Cat"; // String literal , created in spring pool, hence returns true
        String s2 = "Cat"; // Cat == Cat

        System.out.println(s1 == s2);

        String d1 = "Dog";
        String d2 = "dog";

        System.out.println(d1 == d2);

        String t1 = new String("Tiger");
        String t2 = new String("Tiger");

        System.out.println(t1 == t2);
        //     new String("Tiger") == new String ("Tiger") ==> false

        System.out.println("===================================");

        String  c1 = "Cybertek"; // String Pool
        String c2 = new String("Cybertek"); //heap
        String c3 = new String("Cybertek");
        String c4 = "Cybertek";
        String c5 = "cybertek";

        System.out.println(c1==c2); // false
        //              "Cybertek" == new String("Cybertek") ==. false

        System.out.println(c2 == c3);// false
        // new String("Cybertek") == new String("Cybertek") ==> false ,
        // in different locations two different objects are created

        System.out.println(c1 == c4); // true ==> "Cybertek" == "Cybertek"

        System.out.println(c4 == c5);// "Cybertek" == "cybertek" ==> false


            }
}
