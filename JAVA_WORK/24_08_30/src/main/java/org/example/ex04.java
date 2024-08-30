package org.example;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ex04 {
    public static void main(String[] args) {

        ZoneId.getAvailableZoneIds()
                .stream()
                .sorted()
                .filter(s -> s.contains("Asia"))
                .forEach(System.out::println);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);



    }
}
