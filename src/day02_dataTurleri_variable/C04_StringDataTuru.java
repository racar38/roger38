package day02_dataTurleri_variable;

import java.util.Locale;

public class C04_StringDataTuru {

    public static void main(String[] args) {

        int sayi=20;

        String isim= "Resul Acar";

        System.out.println(isim.toUpperCase()); //RESUL ACAR
        System.out.println(isim.toLowerCase()); //resul acar
        System.out.println(isim); // Resul Acar

        String str1 ="Java";
        String str2 = "Candir";
        System.out.println(str1 + str2); // JavaCandir

        // iki tane String + isareti ie toplanmaya calisilirsa
        // Java o iki String'i BIRLESTIRIR
        // JavaCandir

        String str3 = "30";
        String str4 = "40";
        System.out.println(str3+str4);



        // verilen isim ve soyismi
        // Girilen ali uzunkavak database'e kaydedildi.
        // şeklinde yazdirin

        String adi = "Resul";
        String soyadi = "Acar";
        System.out.println("girilen " + adi+ " " + soyadi + " database'e kaydedildi.");

        // " " arasindaki bosluklar konsolda yazdirilan metne yansir
        // ancak kodlar arasinda birakilan bosluklar metne yansimaz
        // System.out.println("Girilen "+      adi       + " " + "database'e kaydedildi)


    }
}
