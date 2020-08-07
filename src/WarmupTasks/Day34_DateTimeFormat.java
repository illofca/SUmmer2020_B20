package WarmupTasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Day34_DateTimeFormat {
    public static void main(String[] args) {

        DateTimeFormatter dayHourAmDate = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt.format(dayHourAmDate));
    }




}
