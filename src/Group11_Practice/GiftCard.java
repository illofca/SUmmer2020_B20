package Group11_Practice;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);


        String word = scan.nextLine();

        int price = 100;

        String result = "";
        String change = "";

        if(word.equals("Smartphone")){
            result = "Sorry, not enough funds on your gift card!";
        }else if (word.equals("Laptop")){
            result = "Sorry, not enough funds on your gift card!";
        }else if(word.equals("Charger")){
            result = "Thank you for your purchase!";
            change = "Your current balance is:" + (price - 15);
        }else if(word.equals("USB cable")){
            result = "Thank you for your purchase!";
            change = "Your current balance is:" + (price - 10);
        }else if(word.equals("Headphones")){
            result = "Thank you for your purchase!";
            change = "Your current balance is:" + (price - 30);
        }else if(word.equals("Pants")){
            result = "Thank you for your purchase!";
            change = "Your current balance is:" + (price - 50);
        }else if(word.equals("Hat")){
            result = "Thank you for your purchase!";
            change = "Your current balance is:" + (price - 25);
        }else if(word.equals("Socks")){
            result = "Thank you for your purchase!";
            change = "Your current balance is:" + (price - 5);
        }else if(word.equals("Blanket")){
            result = "Thank you for your purchase!";
            change = "Your current balance is:" + (price - 60);
        }else if(word.equals("Pillow")){
            result = "Thank you for your purchase!";
            change = "Your current balance is:" + (price - 40);
        }else{
            result = "Invalid item!";
        }

        System.out.println(result);
        System.out.println(change);
    }
}


