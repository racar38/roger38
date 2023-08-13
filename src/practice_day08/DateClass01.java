package practice_day08;

import java.time.LocalDateTime;

public class DateClass01 {

        // Soru: Java'da tarih ve saat bilgisini temsil etmek için hangi sınıflar kullanılır? Verilen
// bir örnekle tarih ve saat bilgisini nasıl elde edebileceğinizi gösteriniz.


        public static void main(String[] args) {
            LocalDateTime currentTime=LocalDateTime.now();
            System.out.println("Şu anki saat: "+currentTime);  // anlık zaman

        }
}
