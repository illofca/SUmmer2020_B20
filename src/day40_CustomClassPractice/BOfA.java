package day40_CustomClassPractice;

public class BOfA {

    public static void main(String[] args) {

        BankAccount Dawud = new BankAccount();

        Dawud.setAccountInfo("Saving", "Dawud Abduwali", "12345678");

        Dawud.getAccountInfo();
        Dawud.deposit(1000);

        Dawud.checkBalance();

        Dawud.withDraw(500);

        Dawud.checkBalance();


    }
}
