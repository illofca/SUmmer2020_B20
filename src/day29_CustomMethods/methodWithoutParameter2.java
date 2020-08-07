package day29_CustomMethods;
/*
step1: print hello 5 times
step2: print your school name
step3: print hello 5 times
step4: print your name
step5: print hello 5 times
 */

public class methodWithoutParameter2 {
    /*
   Access-Modifier  Specifier  return-type   name(){
   }
    */
    public static void main(String[] args) {
        PrintHello5X();
        System.out.println("Cybertek");
        PrintHello5X();
        System.out.println("Izzet");
        PrintHello5X();

    }

    public static void PrintHello5X(){
        for(int i = 10; i >= 6; i-- ) {
            System.out.println("Hello");



        }

    }
}
