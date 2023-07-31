package proje_practice;

import java.util.Scanner;

import static practice_day04.T120_WiseMarket.cikis;

public class Q4 {
    /*
         ATM
     Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
     Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
     Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

     Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme
      ve cikis islemleri olacaktır.

     Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

     Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
     eger değilse menü ekranina geri donsun.

     Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
          */
    static String kartNo = "123456";
    static String sifre = "1234";

    static Scanner scanner = new Scanner(System.in);  // class sınıfında tanımladım tum class'larda kullanılabilir...
    static double bakiye = 50000;

    public static void main(String[] args) {

        giris();
    }

    public static void giris() {

        /*
         Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
     Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
     Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
         */

        System.out.print("LUTFEN KART NUMARASI GIRINIZ : ");
        String kKartNo = scanner.nextLine().replace(" ", ""); // arada bosluk girme ihtimalini kaldirdik
        System.out.print("SIFRENIZI GIRINIZ : ");
        String kSifre = scanner.nextLine().replace(" ", "");

        if (kKartNo.equals(kartNo) && kSifre.equals(sifre)) {
            menu();
        } else {
            System.out.println("HATALI GIRIS YAPTINIZ...");
            giris();
        }
    }
    public static void menu() {
        /*
         Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme
      ve cikis islemleri olacaktır.
         */
        System.out.println("******NUTELLA BANK******\n" +
                "1.BAKIYE SORGULAMA\n" +
                "2.PARA YATIRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GONDERME\n" +
                "5.SIFRE DEGISTIRMA\n" +
                "6.CIKIS\n" +
                "SECIM : ");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1: {
                bakiyeSorgula();
            }
            case 2: {
                System.out.print("LUTFEN YATIRILACAK MIKTARI GIRINIZ : ");
                double miktar = scanner.nextDouble();
                paraYatirma(miktar);
            }
            case 3: {
                System.out.print("LUTFEN PARA CEKME MIKTARI GIRINIZ : ");   // scope lar farklı oldugu icin miktar'lar her scope da farklı olur
                double miktar = scanner.nextDouble();
                paraCekme(scanner.nextDouble()); // miktar bu sekilde de yazılabilir
            }
            case 4: {
                paraGonderme();
            }
            case 5: {
                sifreDegistirme();
            }
            case 6: {
                System.out.println("BIZI SECTIGINIZ ICIN TESEKKURLER...");
                System.exit(0); // butun kodlar calısmayı bıtırır ve sistemden cıkıs yapar anlamında
            }
            default: {
                System.out.println("YANLIS GIRIS YAPTINIZ");
                menu();
            }
        }
    }

    public static void sifreDegistirme() {
        // Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,

        scanner.nextLine(); //dummy atlama problemlerini cozduk
        System.out.print("MEVCUT SIFREYI GIRINIZ");
        String kSifre = scanner.nextLine();
        if (kSifre.equals(sifre)) {
            System.out.print("YENI SIFRE GIRINIZ : ");
            sifre = scanner.nextLine();
            giris();
        } else {
            System.out.println("SENDE KIMSIN...");  // 3 defadan fazla yanlıs girerse cıkıs yaptırın odev ???
            sifreDegistirme();
        }
    }
    public static void paraGonderme() {
        // Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
        //     eger değilse menü ekranina geri donsun.
        scanner.nextLine(); // dummy atlama problemlerini ortadan kaldirmak icin
        System.out.print("LUTFEN IBAN NUMARASINI GIRINIZ: ");
        String ibanNo = scanner.nextLine().toUpperCase().replace(" ", "");
        if (ibanNo.startsWith("TR") && ibanNo.length() == 26) {
            System.out.print("LUTFEN GONDERCEGINIZ MIKTARI GIRINIZ : ");
            double miktar = scanner.nextDouble();
            if (miktar <= bakiye) {
                bakiye -= miktar;
                bakiyeSorgula();
            } else {
                System.out.println("BAKIYENIZ YETERSIZ...");
                menu();
            }
        } else {
            System.out.println("HATALI IBAN GIRISI YAPTINIZ");
            menu();
        }
    }
    public static void paraCekme(double miktar) {

        if (miktar <= bakiye) {
            bakiye -= miktar;
            bakiyeSorgula();
        } else {
            System.out.print("BAKIYEDEN BUYUK MIKTAR CEKEMEZSIN...\n" +
                    "MIKTAR GIRINIZ : ");
            double yeniMiktar = scanner.nextDouble();  // method icinde kendisini cagiriyoruz "recursive method denir"
            paraCekme(yeniMiktar);      // yeni miktar belirledik diger miktar ile karismamasi icin
        }
    }
    public static void paraYatirma(double miktar) {
        bakiye += miktar;
        bakiyeSorgula();
    }

    public static void bakiyeSorgula() {
        System.out.println("BAKIYE :" + bakiye + " $");
        menu();
    }
}

/*
  && operatoru :  birbirine bagli mantiksal ifadeleri incelerken, ilk false degeri ile
  karsilastiginda, sonucun false olacagini algilar ve geriye kalan mantiksal ifadeleri
  incelemeden hemen sonucu false olarak atar.
  & operatoru  :  ise birbirine bagli mantiksal ifadeleri incelerken, herbir mantiksal
  ifadenin sonucuna gore karar vermez, islemin sonucuna kadar gider. Tum islem
  bittikten sonra sonuca atama yapar.
  */