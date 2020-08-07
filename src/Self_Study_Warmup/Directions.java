package Self_Study_Warmup;

import java.util.Scanner;

public class Directions {
    public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);
            String start = scan.next();
            String end = scan.next();
        String result = "";
        String a = "right";
        String b = "down";
        String c = "left";
        String d = "up";
        String e = " > ";
        String f = " found";

        String ab = a + ": " + end + f;
        String ac = a + e + b + ": " + end + f;
        String ad = a + e + b + e + c + ": " + end + f;
        String bc = b + ": "+ end + f;
        String bd = b + e + c+ e+ end + f;
        String ba = b + e + c+ e + d + ": " + end + f;
        String cd = c + e + ": " + end + f;
        String ca = c + e + d + ": " + end + f;
        String cb = c + e + d + e + a + ": " + end + f;
        String da = d + ": " + end + f;
        String db = d + e + a + ": " + end + f;
        String dc = d + e + a + e + b + ": " + end + f;
        String aa = end + f;





        if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("B")){
            result = ab;

        }else if(start.equalsIgnoreCase("A") && end.equalsIgnoreCase("C")){
            result =ac;
        }else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("D")){
            result =ad;
        }else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("C")){
            result =bc;
        }else if(start.equalsIgnoreCase("B") && end.equalsIgnoreCase("D")){
            result =bd;
        }else if(start.equalsIgnoreCase("B") && end.equalsIgnoreCase("A")){
            result =ba;
        }else if(start.equalsIgnoreCase("C") && end.equalsIgnoreCase("D")){
            result =cd;
        }else if(start.equalsIgnoreCase("C") && end.equalsIgnoreCase("A")){
            result =ca;
        }else if(start.equalsIgnoreCase("C") && end.equalsIgnoreCase("B")){
            result =cb;
        }else if(start.equalsIgnoreCase("D") && end.equalsIgnoreCase("A")){
            result =da;
        }else if(start.equalsIgnoreCase("D") && end.equalsIgnoreCase("B")){
            result =db;
        }else if(start.equalsIgnoreCase("D") && end.equalsIgnoreCase("C")){
            result =dc;
        }else if(start.equalsIgnoreCase(end)){
            result=aa;
        }


        System.out.println(result);




    }
}


