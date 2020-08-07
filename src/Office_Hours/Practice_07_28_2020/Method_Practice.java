package Office_Hours.Practice_07_28_2020;

import java.util.ArrayList;

public class Method_Practice {
    //Access-Modifier   Specifier   return-type     Name(Parameter){ Statements }
    //                  not-Mand    mandatory       extra info

    //                              void(just for executing func)
    //                              data_type(executes func + returns value)
    public static void main(String[] args) {
        String name = "Izzet";

        String reversedName = reverseStr(name);

        System.out.println(reverseStr(name));
        System.out.println(reversedName);

        palindrome("Level");
        palindrome(name);

        System.out.println("========================================");
       String[] names = {"Aslan", "Ramazan", "Alex", "Erfan", "Aalia", "Ayhan"};

        ArrayList<String> nameList = new ArrayList<>();

       for(String each : names){
          // System.out.println(reverseStr(each));
        // palindrome(each);
           nameList.add(reverseStr(each));

       }

        System.out.println(nameList);


    }

    public              static       String         reverseStr(String str) { //ABC

        String result = "";//CBA

        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }


        return result;

    }

    public static void palindrome(String str) {
        String reversedStr = reverseStr(str);
        boolean palindrome = str.equalsIgnoreCase(reversedStr);

        System.out.println(palindrome? str +  " is Palindrome" : str + " is not Palindrome");
    }

}
