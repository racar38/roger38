package Practiceday_extra;

import java.util.Scanner;

public class ornek22 {

    /*
    Soru 22-)
      Kullanıcıdan 2 tamsayı girmesini isteyin,
      ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
    Giriş :
    30 ve 40

   Beklenen Çıktı:
   30 ve 40 için EBOB= 10
   30 ve 40 için EKOK= 120
   ipucu:
   Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen  2 adet tamsayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        System.out.println("Girdiginiz sayilar sirasiyla : " + sayi1 + "-" + sayi2);

        int sayac = 0;
        int limitEbob = 0;


        if (sayi1 < sayi2) {

            limitEbob = sayi1;

        } else {
            limitEbob = sayi2;
        }

        for (int i = limitEbob; i >= 2; i--) {

            if (sayi1 % i == 0 && sayi2 % i == 0) {
                System.out.println("Bu sayilarin EBOB degeri : " + i);
                sayac++;
                break;
            }
        }
        if (sayac == 0) {
            System.out.println("Bu sayilarin EBOB degeri yoktur");
        }
        sayac = 0;

        for (int i = 1; i < 100000; i++) {

            if (i % sayi1 == 0 && i % sayi2 == 0) {
                System.out.println("Bu sayilarin EKOK degeri : " + i);
                sayac++;
                break;
            }
        }
        if (sayac == 0) {
            System.out.println("Bu sayilarin EKOK degeri yoktur");
        }
    }
}
