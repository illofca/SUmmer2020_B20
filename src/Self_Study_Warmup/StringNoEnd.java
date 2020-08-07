package Self_Study_Warmup;

import java.util.*;

public class StringNoEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        String  result ="";


        for(int i=0; i<=txt.length()-1; i++){
            result = txt.substring(0, txt.length()-1);

        }


            System.out.println(result);

        }
    }

