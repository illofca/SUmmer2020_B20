package day12_Switch_Scanner;

public class Switch {    public static void main(String[] args) {

        int a = 10;
        switch (a){
            default:
                System.out.println("Invalid Case");
                break;

            case 5:
                System.out.println("Five");
                break;//not mandatory to give.
                      // if not given the code will execute the next
            case 1:
                System.out.println("One");
                break;
                   }
    }



}
