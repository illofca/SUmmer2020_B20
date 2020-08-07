package day15_String;

public class  String_Method {

    public static void main(String[] args) {
        String name ="Cybertek";
        //            01234567

        // charAt(index)
        char ch1 = name.charAt(0); // 'C'
        char ch2 = name.charAt(5); // 't'

        System.out.println(ch1);
        System.out.println(ch2);

        //length() ==> int
        int l =   name.length();
        System.out.println(l);

        // last index: length of String - 1
        int lastIndexNumber = name.length() - 1;

        System.out.println( lastIndexNumber );

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);


        //toLowerCase
        String  name1 = "CYBERTEK SCHOOL"; // "cybertek school"
        name1=name.toLowerCase();

        System.out.println(name1);
        name1 = name.toUpperCase();

        System.out.println(name1);

        // trim():

        String p = "       Cybertek School      ";

        p = p.trim();
        System.out.println(p);





    }
}
