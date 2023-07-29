package day18_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C01_SifreKontrolu {

    public static void main(String[] args) {

             /*
                      //Soru 4 : Main method'da Kullanicidan bir sifre isteyip,
                      olusturacagimiz bir method'da asagidaki sartlari kontrol edin
                       ve method'dan true veya false döndürün
                      asagidaki sartlari kontrol edin ve kullaniciya
                       duzeltmesi gereken tum eksikleri soyleyin, tum sartlari saglanincaya kadar
                         tekrar deger isteyin ve sartlar saglandiginda;
                         "sifre basariyla kaydedildi" yazdirin
                        - ilk harf kucuk harf olmali
                        - son karakter rakam olmali
                        - sifre bosluk icermemeli
                        - uzunlugu en az 10 karakter olmali
              */

      /*
        Bu soruyu day17'de cozduk
        ama java 'da daha profesyonel kodlama icin
        iki duzeltme yapacagiz
        1-
        while loop onundeki parantezin ici
        true oldugu muddetce loop calisir

        bu soruda sonuc variable'i da boolean deger iceriyor
        amqa sorunun mantigi caisinda
        sonuc false oldugu muddetce loop calismali

        2-
         while loop her calistiginda
         Scanner scanner = new Scanner(System.in);
          String sifre = scanner.nextLine();
         calisiyor ve yeni bir scanner objesi olusturuyor

         bunun yerine daha guzel olani loop dan once objeyi olusturup
         loop'un icerisinde sadece deger ataamasi yapmaktir.

       */



        boolean sonuc=false;
        Scanner scanner;           // 2.düzeltme
        String sifre;



        while (!sonuc) {   //   sonuc==false isleminin sonucu  1. düzeltme


            scanner = new Scanner(System.in);
            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scanner.nextLine();
            sonuc=sifreKontrolEt(sifre);
        }
        System.out.println("sifreniz basariyla kaydedildi" );
    }

    public static boolean sifreKontrolEt(String sifre){

        int sayac=0; // sayac hatalari saysin

        //- ilk harf kucuk harf olmali
        char ilkHarf=sifre.charAt(0);

        if (!(ilkHarf>='a' && ilkHarf<='z')){

            System.out.println("ilk karakter kucuk harf olmali");
            sayac++;
        }

        //- son karakter rakam olmali

        char sonKarakter=sifre.charAt(sifre.length()-1);
        if (!(sonKarakter>=0 && sonKarakter>=9)){
            System.out.println("son karakter rakam olmali");
            sayac++;
        }

        //- sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }

        //- uzunlugu en az 10 karakter olmali
        if (sifre.length()<10){
            System.out.println(" uzunlugu en az 10 karakter olmali");
            sayac++;
        }

        if (sayac==0){
            return true;
        }else{
            return false;
        }

    }
}


