package Self_Study_Warmup;

import java.util.Scanner;

public class LaptopPrice {
    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        int memory = 0;
        String resolution = "";

        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        if (screenSize == 13.3) {
            price += 200;
        } else if (screenSize == 15.0) {
            price += 300;
        } else if (screenSize == 17.3) {
            price += 400;
        }

        System.out.println("Select CPU type:");
        cpu = scan.next();

        if (cpu.contains("i3")) {
            price += 150;
        } else if (cpu.contains("i5")) {
            price += 250;
        } else if (cpu.contains("i7")) {
            price += 350;
        }

        System.out.println("Select RAM size:");
        ram = scan.nextInt();
        price += (ram / 4 * 50);


        System.out.println("Select storage type:");
        storageType = scan.next();
        System.out.println("Enter memory size:");
        memory = scan.nextInt();
        if (storageType.contains("HDD")) {
            price += memory / 500 * 50;
        } else if(storageType.contains("SSD")) {
            price += memory / 500 * 100;

        }
        System.out.println("Enter screen resolution:");
            resolution =scan.next();
        if(resolution.contains("FULLHD")){
            price += 100;
        }else if(resolution.contains("4K")){
            price += 200;

    }






        System.out.println("Laptop price is: $" +price);




}
}

