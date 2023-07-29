package day03_scanner;

public class C01_NamingConvention {

    public static void main(String[] args) {

        // Java case sensitive ( buyuk kucuk harf duyarli)'dir.

        int sayi = 10;

        //int sayi = 20; kabul etmez
        //long sayi = 25; kabul etmez

        int Sayi = 25;
        int SAYI = 23;
        int sAYi = 45;
        System.out.println(Sayi); //25
        System.out.println(SAYI); //23

        // Variable isimleri kucuk harfle baslar
        // buyuk harfle baslarsaniz java kabul eder
        // ancak genel kullanima aykiridir.

       // int sa yi = 34; kabul etmez boşluk
        //int sa&yi = 34; kabul etmez
        int sa$yi =20 ; // kabul eder

        // $ ve _ isimde kullanilabilir ilk harf olarak kullanilmasi
        // naming Convention'a uygun değildir.

        // birden fazla kelimeden olusan bir isim varsa ' camelCase ' kullanilir

        int sinifinEnYuksekNotu = 99;



    }

}
