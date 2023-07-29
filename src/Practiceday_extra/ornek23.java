package Practiceday_extra;

import java.util.Scanner;

public class ornek23 {

    public static void main(String[] args) {

        /*
              Soru 23-)
      Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
      Method bize çıktıyı döndürsün.
      Örnek:
      Girdi: 6
      Çıktı: 6!=65432*1=720
      ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
               */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Faktoriyelini hesaplamak icin bir tamsayi giriniz");
        int sayi= scanner.nextInt();

        faktoriyelHesapla(sayi);

    }

    public static int faktoriyelHesapla(int sayi){

        int sayac=0;
        int toplam=1;
        for (int i = sayi; i >=1 ; i--) {
            toplam*=i;
            sayac++;
        }
        System.out.println("Girilen  sayinin Faktoriyeli : " + toplam);
        return sayi;
    }
}
