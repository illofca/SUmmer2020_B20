package Replit;

import java.util.Scanner;

public class Arrays_SplitEmail_119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        int count =0;
        for(int i=0; i<=email.length()-1; i++){
            if(email.charAt(i)=='@'){
                count++;
            }
        }
        if(count==-1){
            String [] words = email.split("@");
            System.out.println("Email id: "+words[0]);
            System.out.println("Email domain: "+words[1]);


        }else {
            System.out.println("invalid email");



        }

    }

}