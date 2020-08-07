package day34_WrapperClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class warmup {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);
        System.out.println(ldt.format(dtf));
    }
}
