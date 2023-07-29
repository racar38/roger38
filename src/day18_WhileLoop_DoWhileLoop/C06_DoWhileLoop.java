package day18_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {

    public static void main(String[] args) {

        //     Kullanicidan toplamak uzere sayilar isteyin
        //     kullanici islemi bitirmek icin 0'a basmalidir
        //     kullanici 0'a bastiginda kac pozitif sayi girdigini
        //     ve toplamlarının kac oldugunu yazdirin
        /*   once while loop ile yapalim

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int girilenSayi = 9;   // 0 değerini atamada ne atarsan ata yoksa direk sonuc 0 yazdirir

        while (girilenSayi != 0) {

            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere  pozitif sayi giriniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayac++;
            }
        }
        System.out.println("Girilen " + sayac + "adet sayinin toplami : " + toplam);

         */

        // do while ile yapalim

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int girilenSayi;

        do {
            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere  pozitif sayi giriniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayac++;
            }

        }while (girilenSayi!=0);

        System.out.println("Girilen " + sayac + "adet sayinin toplami : " + toplam);
    }
}
