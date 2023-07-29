package Practiceday_extra;

import java.util.Scanner;

public class ornek12 {

    public static void main(String[] args) {

        /*
           Verilen iki sayının toplamını -(sıfırdan büyük veya eşit olabilir)-
           hesaplamak ve yazdırmak için bir program oluşturalım
           Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa,
           "Fazla Yüklenme" yazdıralım
          Ipucu:  IF/Else kullanabilirsiniz.
      Örnek:
   İki tamsayı girin:
   25  veya  4567986321453
   46   veya 123456
   Konsolda Çıktı :
   Sayıların toplamı: 71  veya  Fazla Yüklenme
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Toplamini bulmak icin Lutfen 2 tamsayi giriniz");
        System.out.print("Lutfen ilk sayiyi giriniz : ");
        long sayi1 = scanner.nextLong();
        System.out.print("Lutfen ikinci sayiyi giriniz : ");
        long sayi2 = scanner.nextLong();
        long toplam = sayi1 + sayi2;

        String sayi1uzunluk = "" + sayi1;
        String sayi2uzunluk = "" + sayi2;
        String toplamUzunluk = "" + toplam;


        if (sayi1 >= 0 && sayi2 >= 0) {

            if (sayi1uzunluk.length() > 10 || sayi2uzunluk.length() > 10 || toplamUzunluk.length() > 10) {
                System.out.println("Fazla Yüklenme");
            } else {
                System.out.println("Sayıların toplamı :" + toplam);
            }

        }
    }
}


  // int/double/long bir sayiyin basamak sayisini bulmak için " atayarak string bir ifade yapariz
  // ve sonrasinda ise lenght olarak çözüm sağlariz