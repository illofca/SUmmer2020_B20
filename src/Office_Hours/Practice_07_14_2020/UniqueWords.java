package Office_Hours.Practice_07_14_2020;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {"C#" , "C#" , "Python" , "Python" , "Java"};
        //                  0     1     2           3       4

        for (String b : words) {


            int count = 0; // count is frequency of s
            for (String a : words) {
                if ( a.equals ( b ) ) {
                    count += 1;
                }
            }
            if ( count == 1 ) { // unique word occurs only once
                // to find  words occuring 2 times change valu to 2

                System.out.println ( b );
            }

        }
    }
}
