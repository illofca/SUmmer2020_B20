package Self_Study_Warmup;

public class Concat {
    public static void main(String[] args) {
        String str = "Cybertek";

        str = str.concat ( " School" ); // without assigning to str, it would not concat
        str.toLowerCase ( );
        System.out.println ( str );

        System.out.println ( "=====================" );


        for (int i = 0; i <= 4; ) {
            i++;
            System.out.print ( i + " " );
        }
        System.out.println ( );
        System.out.println ( "=================" );


        int a = 0;
        int j = 7;

        for (a = 0; a < j - 1; a += 2) {
            System.out.print ( a + " " );
        }

        

    }
}

