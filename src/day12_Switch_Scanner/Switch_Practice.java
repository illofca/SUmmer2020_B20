package day12_Switch_Scanner;

public class Switch_Practice {
    public static void main(String[] args) {

        int a = 2;
        String result = "";
        switch (a) {
            default:
                result ="Invalid Entry";
                break;

            case 1:
                result ="Monday";
                break;//not mandatory to give.
            // if not given the code will execute the next
            case 2: result ="Tuesday"; break;
            case 3: result ="Wednesday"; break;
            case 4: result ="Thursday";  break;
            case 5:
                result ="Friday";
                break;
            case 6:
                result ="Saturday";
                break;
            case 7:
                result ="Sunday";
                break;
        }

        System.out.println(result);
    }
}
