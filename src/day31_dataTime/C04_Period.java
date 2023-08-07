package day31_dataTime;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {

    public static void main(String[] args) {
        // Kullanicinin verdigi dogum tarihine gore
        // kullanicinin yasini yil ve ay olarak yazdiran bir program hazirlayin
        LocalDate dogumTarihi = LocalDate.of(1988, 04, 02);
        LocalDate bugun = LocalDate.now();
        System.out.println(Period.between(dogumTarihi, bugun)); // P35Y4M5D
        System.out.println(Period.between(dogumTarihi, bugun).getYears()); // 35

    }

}

