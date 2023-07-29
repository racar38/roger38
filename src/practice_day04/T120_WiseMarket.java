package practice_day04;

import java.util.Scanner;

public class T120_WiseMarket {

     /*
    Bir market yazilimi yazdiginizi dusunerek asagidaki menu ile giris yapip,ilgili bolume yonlendiren
    alisveris yaptiran ve sepet tutarini hesaplayarak hafizada tutan,kasaya gidince fis yazdiran bir program hazirlayin

  ==================== WISE MARKET KASA PROGRAMI ===================================
            ilk programa girildiginde bizi bir menu karsilasin bu secenekler
  1 ŞARKÜTERİ ÜRÜNLERİ
  2 MANAV     ÜRÜNLERİ
  3 MARKET    ÜRÜNLERİ
  secime gore ,
  4-urunleri listele ve
  5-fiyatlari gelsin

    Variable'lari belirleyelim
    UrunAdi , urunFiyati , urunMiktari , urunKodu , sepet , toplam

    */

    static Scanner scanner=new Scanner(System.in);
    static String urunAdi;
    static double urunFiyati;
    static double urunMiktari;
    static int urunKodu;
    static String sepet="";
    static double toplam;
    static boolean ekUrun=false;

    public static void main(String[] args) {girisEkrani();{

    }




    }

    public static void girisEkrani(){
        System.out.println("==============T120 - WISE MARKET==============");
        System.out.println("==============   Hoşgeldiniz    ==============");
        System.out.println("--------------       Menü       --------------");
        System.out.println("Lutfen Alışveriş Yapmak İstediğiniz Reyonu Seçiniz");
        System.out.println("1- Şarküteri \n2- Manav \n3- Market\n4- Fiş Yazdir\n5- Çıkış");

        int secim= scanner.nextInt();
        if (!(secim>=1 && secim<=5)){
            System.out.println(" Uyari: Gecersiz bir tusa bastiniz. Tekrar giriniz ");
            girisEkrani();
        }else{
            switch (secim){
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }
    }
    public static void sarkuteri() {
        System.out.println("Sarkuteri Reyonuna Hosgeldiniz");
        System.out.println("Almak istediginiz urun numarasiniz.\n61-Kasar peyniri 130₺\n62-Zeytin 120₺\n63-Sucuk 200₺\n64-Kiyma 350₺");
        while(!ekUrun)
            urunKodu= scanner.nextInt();
        System.out.println("Kac kg alacaksiniz?");
        urunMiktari= scanner.nextInt();
        switch (urunKodu){
            case 61:
                urunAdi="Kasar Peyniri";
                urunFiyati=130;
                System.out.println(urunMiktari+ "kg "+urunAdi + ":" + (urunFiyati*urunMiktari) +"₺");
                break;
            case 62:
                urunAdi="Zeytin";
                urunFiyati=120;
                System.out.println(urunMiktari+ "kg "+urunAdi + ":" + (urunFiyati*urunMiktari) +"₺");
                break;
            case 63:
                urunAdi="Sucuk";
                urunFiyati=200;
                System.out.println(urunMiktari+ "kg "+urunAdi + ":" + (urunFiyati*urunMiktari) +"₺");
                break;
            case 64:
                urunAdi="Kiyma";
                urunFiyati=350;
                System.out.println(urunMiktari+ "kg "+urunAdi + ":" + (urunFiyati*urunMiktari) +"₺");
                break;
        }
        urunFiyati=urunKodu*urunFiyati;
        toplam+=urunFiyati;
        System.out.println("Olusan sepet tutari : " +toplam);
        sepet+=urunAdi+ ":" + urunFiyati+ "₺";
        System.out.println("Baska bir urun eklemek ");



        girisEkrani();
    }
    public static void manav() {
        System.out.println("Manav Reyonuna Hosgeldiniz");girisEkrani();
    }
    public static void market() {
        System.out.println("Market Reyonuna Hosgeldiniz");girisEkrani();
    }
    public static void fisYazdir() {
        System.out.println("Alısveris Fisi");girisEkrani();
    }
    public static void cikis() {
        System.out.println("Cıkıs Ekrani");girisEkrani();
    }
}
