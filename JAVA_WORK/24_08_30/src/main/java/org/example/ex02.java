package org.example;
import java.time.LocalDate;
import java.time.Period;

public class ex02 {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(localDate.getYear(), 7, 17);

        Period period = Period.between(localDate, localDate1);

        System.out.println(period);
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
}