package practice_day06;

import java.util.Scanner;

public class methodCreation {

     /*
    Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
    olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
    sonuclarini donduren bir method olusturun.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println(asalSayiKontrolu(sayi));

    }

    public static String asalSayiKontrolu(int sayi) {

        String sonuc = "sayi asal sayidir";
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sonuc = "asal sayi degildir";
            }

        }
        return sonuc;
    }
}
