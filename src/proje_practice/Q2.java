package proje_practice;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
/*
        2. SORU
        Kullanıcı tarafından girilen metni "Sezar Şifreleme Yöntemi" ne göre şifreleyiniz.
         Sezar Şifreleme: Sezar şifrelemesi, ilk kez Romalı lider Jül Sezar tarafından kullanılmış olan şifreleme tekniğidir.
        Bu şifreleme en basit ve en bilinen şifreleme tekniklerinden biridir.
 Düz metindeki her harfin, alfabeden belirli bir sayı ileride konumlu olan bir harfle değiştirildiği bir şifreleme türüdür.
        //hello ----> ıfmmp --->1 birim kaydırılmış hali
 */

        System.out.print("Sifrelenecek metni giriniz :  ");
        Scanner scan=new Scanner(System.in);
        String metin=scan.nextLine().toUpperCase();
        System.out.print("Kaydirma miktarini giriniz :  ");
        int kaydirma=scan.nextInt();
        sifreleme(metin,kaydirma);

    }

    public static void sifreleme(String metin,int kaydirma){

        String sifrelenmisMetin=""; // depolanacagi metin olusturduk
        String alfabe="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i <metin.length() ; i++) {
            char karakter=metin.charAt(i);  // karakterleri gezin
            int karakterIndex=alfabe.indexOf(karakter); // karakterin alfabedeki indexini bulduk
            int yeniIndex=(karakterIndex+kaydirma)%alfabe.length(); // kaydırma sonucu olusan index
                                                                    // 29 harf uzeri olmasi durumunda % olarak tekrar dönmesi icin
            sifrelenmisMetin+=alfabe.charAt(yeniIndex);// kaydırma sonucu olusan karakterleri depolanacagi yere ekle

        }
        System.out.println("Sifrelenmis metin : " + sifrelenmisMetin);
    }
}
