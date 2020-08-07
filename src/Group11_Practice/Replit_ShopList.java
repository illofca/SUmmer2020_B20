package Group11_Practice;
import java.util.Scanner;
public class Replit_ShopList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        double price1 = scan.nextDouble();
        int count1 = scan.nextInt();

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        double price2 = scan.nextDouble();
        int count2 = scan.nextInt();

        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        double price3 = scan.nextDouble();
        int count3 = scan.nextInt();


        double totalPrice = (count1 * price1) + (count2 * price2) + (count3 * price3);

        String report =(count1==0) ? "Item2: "+item2+"Price: "+ (price2*count2)+","+"Item3: "+item3+"Price: "+ (price3*count3):
                       (count2==0) ? "Item1: "+item1+" "+"Price: "+ (price1*count1)+","+" Item3: "+item3+" Price: "+ (price3*count3):
                       (count3==0) ? "Item1: "+item1+" "+"Price: "+ (price1*count1)+","+" Item2: "+item2+" Price: "+ (price2*count2) :
                                "Item1: "+item1+" "+"Price: "+ (price1*count1)+","+"Item2: "+item2+" "+"Price: "+ (price2*count2)+"," +"Item3: " +item3+" "+"Price: "+ (price3*count3);


        System.out.println(report+"\nTotal Price: "+ totalPrice);


        }



    }

