package Group11_Practice;
import java.util.*;


public class Replit_Odd_Even_NumberOfCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your word");
        String word = scan.next();

        int wordLength = word.length();
        char middle1 = word.charAt((word.length() - 1) / 2);

        if (wordLength == 2) {
            System.out.println("" + word.charAt(0) + word.charAt(1) + word.charAt(0) + word.charAt(1));
        }
        else if (wordLength >= 3 && wordLength % 2 != 0) {
            System.out.println(middle1);
        } else if (wordLength == 1) {
            System.out.println("" + word.charAt(0) + word.charAt(0) + word.charAt(0));
        } else if ((wordLength >= 4) && (wordLength % 2 == 0)) {
            System.out.println(("" + word.charAt((wordLength / 2) - 1)) + (word.charAt(wordLength / 2)));
        }
    }
}




