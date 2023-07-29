package Practiceday_extra;

import java.util.Scanner;

public class ornek7 {

    public static void main(String[] args) {

        //Soru 3-)   SCANNER
        //Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.

        //Scanner scan = new Scanner(System.in);
        //System.out.println("Lutfen birinci sayiyi giriniz");
        //double sayi1 = scan.nextDouble();
        //System.out.println("Lutfen ikinci sayiyi giriniz");
        //double sayi2 = scan.nextDouble();
        //System.out.println("Lutfen ucuncu sayiyi giriniz");
        //double sayi3 = scan.nextDouble();
        //System.out.println("Lutfen dorduncu sayiyi giriniz");
        //double sayi4 = scan.nextDouble();
        //System.out.println("Lutfen besinci sayiyi giriniz");
        //double sayi5 = scan.nextDouble();
        //double ortalama = (sayi1 + sayi2 + sayi3 + sayi4 + sayi5) / 5;
        //System.out.println("Girilen bes sayinin ortalamasi : " + ortalama);

        //Soru 4-)   SCANNER
        //Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.

       //Scanner scan1 = new Scanner(System.in);
       //System.out.println("Lutfen bir sayi giriniz");
       //double sayi = scan1.nextDouble();
       //System.out.println("Girilen sayini kupunun yarisi : " + sayi * sayi * sayi / 2);

        // Soru 5-)   SCANNER
        //Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
        //Ipuclari:
        //Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-)

       //Scanner scan2 = new Scanner(System.in);
       //System.out.println("Lutfen karenin kenarini giriniz");
       //double kenar = scan2.nextDouble();
       //System.out.print("Karenin Alani : " + kenar * kenar);
       //System.out.println("");
       //System.out.println("Karenin Cevresi : " + 4 * kenar);

        //Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        // Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        // 1 şeker = 1.5 gr
        //1 kg = 1000 gram      olarak hesaplayınç
        // Ipuclari:
        //·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin

       //Scanner scan3=new Scanner(System.in);
       //System.out.println("Lutfen gunluk kac bardak cay tukettiginizi yaziniz");
       //double cayAdedi= scan3.nextDouble();
       //System.out.println("Lutfen 1 bardak cay icin tuketilen seker adedini giriniz");
       //double sekerMiktari= scan3.nextDouble();
       //System.out.print("Yıllık tuketilen cay adedi : " + 365*cayAdedi + " bardak");
       //System.out.println("");
       //System.out.println("Yıllık tuketilen seker miktari : " + 365*cayAdedi*sekerMiktari*1.5 + " gram");
       //System.out.println("Yıllık tuketilen seker miktari : " + 365*cayAdedi*sekerMiktari*1.5/1000 + " kilo");

        //Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        //(Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        //ipuclari:
        //( Data Casting -> Auto Widening ve Explicit Narrowing )

       //Scanner scan4=new Scanner(System.in);
       //System.out.println("Lutfen ondalikli bir sayi giriniz");
       //double sayi= scan4.nextDouble();

       //int yeniSayi = (int) sayi;

       //System.out.println("Girilen ondalikli sayinin tamsayiya cevrimi : " + yeniSayi);

        // Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        //               Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        //ipuclari:
        //Matematiksel Islemler konusuna bakalim.
        //Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.



       //Scanner scan5=new Scanner(System.in);
       //System.out.println("Lutfen 3 basamakli bir sayi giriniz");

       //int girilenSayi=scan5.nextInt();

       //int birlerBasamagi = 0;
       //int rakamalarToplami = 0;

       //// girilen sayinin birler basamagini bulalim

       //birlerBasamagi=girilenSayi%10;
       //rakamalarToplami=rakamalarToplami+birlerBasamagi;

       //// birler basamagindaki sayiyi bulduk ve bundan kurtulalim
       //girilenSayi=girilenSayi/10;

       //birlerBasamagi=girilenSayi%10;
       //rakamalarToplami=birlerBasamagi+rakamalarToplami;

       //girilenSayi=girilenSayi/10;

       //birlerBasamagi=girilenSayi%10;
       //rakamalarToplami=birlerBasamagi+rakamalarToplami;

       //System.out.println("Girilen 3 basamakli sayinin rakamlari toplami : " +rakamalarToplami);


        //Soru 9-)  Girilen zamanı saniyeye çeviriniz.
        //               Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
        //         Ipucu:
        //         Saati alıp saniyeye cevirebilirsiniz.


        Scanner scan6= new Scanner(System.in);
        System.out.println("Lutfen zamani giriniz");
        System.out.println("Saat : ");
        int saat = scan6.nextInt();
        System.out.println("Dakika");
        int dakika = scan6.nextInt();
        System.out.println("Saniye : ");
        int saniye = scan6.nextInt();

        int toplamSaniye=3600*saat + 60*dakika + saniye;

        System.out.println("Girilen zamanin saniyeye cevrimi : " + toplamSaniye);







    }
}
