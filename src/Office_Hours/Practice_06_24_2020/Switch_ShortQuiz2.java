package Office_Hours.Practice_06_24_2020;

public class Switch_ShortQuiz2 {
    public static void main(String[] args) {
        String opt = "true";

        switch(opt){
            case "true":
                System.out.println("True");
                break;
            default:
                System.out.println("False");
        }
        System.out.println("Done");

        System.out.println(12456+1024);//Short Quiz Q5's answer

        System.out.println("===========================================");

        //Short Quiz Q7

        //line 1  -- for integers we should consider only int, byte,and short
        int x = 1;
        switch (x){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
                //answer bye, short, int

        }
        System.out.println("================================");
        // Short Quiz Q8
        int z=10;
        switch (z){
            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");
            default:
                System.out.println("Friday");
                //SInce we do not have break statement
                // and case value matches the switch value than it prints all 3 lines
                // The answer is Monday Tuesday Friday
        }

        // Short Quiz Q9
      /*  boolean B = true;
        switch (B){
            case true:
                System.out.println("Monday");
            case false:
                System.out.println("Tuesday");
            default:
                System.out.println("Wednesday");  */
                // Answer: Compile error, because switch does not accept double , float, long,
                // so I commented it out to not get compile error for other applications/*
        }

    }

