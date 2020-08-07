package day03_sequences_Variables;

public class Variables {

    public static void main(String[] args) {
        /*length: 11, width: 12, area: 8
         dataType variableName = Data;
        primitive datatype: byte, short, int, long, float, char. boolean
       there are 2 types of

        */


        byte length = 11;
        byte width = 12;

        System.out.println(length * width);
        //byte cannot be use out of range of -128-127, out of range we can use short
        short num2 = 140;
        /*short ranges from -32768 - 32767
         40,000
        short salary = 40000  ==>
        short cannot store this variable since it is bigger than 32767
         SO I can use int
         */
        int salary = 40000;
        /*
        int larger number = 9999999999
        int cannot store it so long can be used which ranges -
        from 9,223,372,036,8547,75,808
         to 9,223,372,036,8547,75,807
         */
        long larger = 9999999999l;
        /*int is the most preferred variable type with numbers
        for decimal number: float, double (double is preferred by compiler)
         */
        // PI = 3.14
        // for decimal double is always possible to assign
        double PI = 3.14;
        System.out.println(PI);

        /* to a decimal number as float use f or F at the end of the value
        this way compiler recognizes it as float

        we use f/F for float and l for long

         */
        float decimal1 = 3.5f;






    }
}
