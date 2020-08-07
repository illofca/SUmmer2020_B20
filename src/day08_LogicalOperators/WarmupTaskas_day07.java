package day08_LogicalOperators;

public class WarmupTaskas_day07 {


    public static void main(String[] args) {
/* 	1. write a java program that converts gallons to liters
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785

	2. write a java program that converts litters to gallons
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785 */
        double g = 3;
        double l = g * 3.785;

        System.out.println(g + (" gallons makes ") + l + " liters");

        System.out.println("=================================");

        double liter = 65;
        double gallon = liter/3.785;
        System.out.println(liter + " liters of gasoline makes "+ gallon + " gallons of gasoline");


        System.out.println("==============================");

        /*3. manually calculate the following code fragements:
				1. int a = 200;
					int b = -a++ + - --a * a-- % 2
					b = ?

				2. int x = 300;
				   int y = 400;
				   int z = x + y - x * y +x / y;*/


        //                  1. int a = 200;
        //					int b = -a++ + - --a * a-- % 2
        //					b = -200 + - 200 * 200 % 2
        //                  b = -200 + 40000 % 2;
        //                  b = -200 + 0;
        //                  b = -200
                int a = 200;
        		int b = -a++ + - --a * a-- % 2;
                System.out.println(b);

                int x = 300;
                int y = 400;
                int z = x + y - x * y +x / y;
              //    z = 300 + 400 - 300*400 + 300/400;
              //    z = 300 + 400 - 120000 + 0;
              //    z = 700       - 120000 + 0;
              //    z = -119300            + 0;
              //    z = -119300 + 0
              //    z = -119300
                System.out.println(z);





    }
}
