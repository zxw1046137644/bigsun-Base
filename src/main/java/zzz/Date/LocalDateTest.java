package zzz.Date;

import java.time.LocalDate;

public class LocalDateTest {


    public int b = 2;

    public void set(int b) {
        b = 3;
    }

    public void set2() {
        set(1);
    }


    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().getMonth());
        System.out.println(LocalDate.now().getMonthValue());
        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println(LocalDate.now().plusDays(1000));
        System.out.println(now.minusDays(now.getDayOfMonth() - 1));
        System.out.println(now.getDayOfWeek().getValue());

    }


}
