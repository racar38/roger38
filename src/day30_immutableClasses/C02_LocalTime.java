package day30_immutableClasses;

import java.time.LocalTime;

public class C02_LocalTime {

    public static void main(String[] args) {

        LocalTime time= LocalTime.now();      // time.class methodlardan olusturuldu...

        System.out.println(time);   //01:26:55.930988

        System.out.println(time.getHour());  //1

        System.out.println(time.getMinute()); // 29

        System.out.println(time.minusMinutes(1000)); // 08:50:36.063835300

        System.out.println(time.plusMinutes(1000));    // 18:11:20.306454100

        System.out.println(time.withHour(15)); // 15:32:06.492958100

        LocalTime time1 = LocalTime.of(12,35);

        LocalTime time2 = LocalTime.of(14,34);

        System.out.println(time1.isBefore(time2)); // true

        System.out.println(time1.isAfter(time2)); // false

    }
}
