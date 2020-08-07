package day20_WhileLoops;
/*
String  str = "Cyber canim sevgili kardesim";

        //String result = ""+str.charAt(str.length()-1) + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);

        //System.out.println(result);
        String  result =" ";

        for(int i = str.length()-1; i >= 0; i--){
            result+= str.charAt(i);
        }
        System.out.println(result);
        */

public class ReverseStringWithWhileLoop {
    public static void main(String[] args) {
        String str = "Cybertek";
         //           01234567

        String result = "";

        int index =  str.length()-1;

        while (index >= 0){

            result+=str.charAt(index);



            index--;

        }
        System.out.println(result);




}
}

