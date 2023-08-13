package practice_day08;


// SORU: verilen bir tarihten belirli gün sayisini ekleyerek gelecekteki bir tarihi hesaplayan bir kod dizisi yaziniz?
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// LocalDateTime:tarih/saat/dakika/saniye/salise içerir
//LocalDate : yıl/gün/ay içerir
public class DateClass02 {
    public static void main(String[] args) {
        LocalDate startDate= LocalDate.of(2023,8,12); // Başlangıç tarihini belirledik
        LocalDate futureDate=calculateFutureDate(startDate,120);
        System.out.println("120 gün sonrasi : " +futureDate);
    }

    static LocalDate calculateFutureDate(LocalDate startDate,long addDay){

        return startDate.plus(addDay, ChronoUnit.DAYS);
    }


}
