package Self_Study_Warmup;
import java.util.*;

public class alejandro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();


        while (a.contains("alejandro") && a.contains("project")) {
            System.out.println("read this mail");
            break;
        }
        while (!a.contains("alejandro") && !a.contains("project")) {

            System.out.println("dont read");
            break;
        }
    }
}


