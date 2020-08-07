package day08_LogicalOperators;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;

public class Classiiii{
    public static void main(String[] args) {


        Clock c = Clock.systemUTC();
        Duration d = Duration.ofHours(5);
        Clock clock = Clock.offset(c, d);
        System.out.println(LocalTime.now(ZoneId.systemDefault()).getHour());






    }
}