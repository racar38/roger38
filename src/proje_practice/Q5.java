package proje_practice;

import java.util.Scanner;

public class Q5 {

  /*  Basit bir Kahve makinesi oluşturun.
1. Şart
 3 çeşit kahvemiz olsun.
    Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"

    Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
    Örn:
    Hangi Kahveyi İstersiniz?
            1.Türk kahvesi
  2.Filtre Kahve
  3.Espresso
2.Şart
    Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
            3. Şart
    Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
    sorusunu sorsun.
            4. Şart
    Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
    sorusunu sorsun.
    Sonuç
    Siparişlerimizi verdik. Son hali görmek istiyoruz.
    konsola şunu yazdırın örnek :
    Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!

   */
  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      // Kahve Seçenekleri
      String[] kahveSecenekleri={"Türk kahvesi","Filtre Kahve","Espresso"};

      //Kahve türünü seçme
      System.out.println("Hangi Kahveyi İstersiniz?");
      for (int i = 0; i < kahveSecenekleri.length ; i++) {
          System.out.println((i+1)+"."+ kahveSecenekleri[i]);
      }
      int kahveSecimi= scanner.nextInt();

      if (kahveSecimi < 1 || kahveSecimi > kahveSecenekleri.length) {
          System.out.println("Geçersiz seçim. Lütfen geçerli bir seçim yapınız.");
          scanner.close();
          return;
      }
      String secilenKahve=kahveSecenekleri[kahveSecimi-1];

      scanner.nextLine();
      //süt ekleme tercihi
      System.out.println("Süt eklemek istemisiniz? (Evet veya Hayır) ");
      String sutTercihi=scanner.nextLine();

      // seker ekleme tercihi
      System.out.println("Şeker ister misiniz ? (Evet veya hayır)");
      String sekerTercihi= scanner.nextLine();

      // kahve boyutu seçimi
      System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy)");
      String boyutTercihi= scanner.nextLine();

      // sipariş son hali
      System.out.println(secilenKahve+" "+boyutTercihi+" hazırdır.Afiyet olsun !!!");

      scanner.close();

  }

}

