package day10_switchCase_StringManipulations;

public class C05_equals {
    public static void main(String[] args) {

        String str1 = "Mehmet";
        String str2 = "MEHMET";
        String str3 = "mehmet";
        String str4 = "MEHmet";
        String str5 = new String("Mehmet");

        System.out.println(str1 == str2); // false
        System.out.println(str3 == str4.toLowerCase()); // false
        System.out.println(str2 == str3.toUpperCase()); // false

        /*
         String'lerde  ( == ) bekledigimiz sonuclari DONMEYEBILIR
         Bunun sebebi String class'ini olustururken yapilan bazi ozelliklerdir
         bu konu ilerde detayli bir sekilde anlatilacak...

         Verilen iki string'i metinsel olaarak ayni olup olmadigini kontrol etmek icin (==) yerine equals()
         metodu kullanilir

           equals() 'u bire bir ayni olan iki metin icin true
           farkli metinler icin false sonucu uretir(döndürür)
           bu karsilastirmada metnin ayni olmasi yaninda ,
           buyuk kucuk harf durumunu da kontrol eder (case sensitive)

           EGER case sensitive olmadan metinleri karsilastirmak isterseniz
           equalsIgnoreCase() 'u kullanilir
         */

        System.out.println(str1.equals(str2)); // Mehmet - - MEHMET  false

        System.out.println(str3.equals(str4.toLowerCase())); // true
        System.out.println(str2 == str3.toUpperCase()); // true

        System.out.println(str1.equalsIgnoreCase(str2)); // true Mehmet--MEHMET
        System.out.println(str1.equalsIgnoreCase(str3)); // true

        //

    }
}
