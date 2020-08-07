package Office_Hours._07_15_2020;

public class FrequencyOfWords2 {
    public static void main(String[] args) {
        String str = "JavajavaJavajavaJAVA".toLowerCase ();
       // str = str.toLowerCase (); //both are same

        int count = 0;
        while(str.contains ( "java" )){
            count++;
            str = str.replaceFirst ( "java", "" );

        }
        System.out.println (count);



    }
}
