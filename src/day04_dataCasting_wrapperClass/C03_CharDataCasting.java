package day04_dataCasting_wrapperClass;

public class C03_CharDataCasting {

    public static void main(String[] args) {

        // char data turu ozel bir data turudur
        // her ne kadar char data turu
        // '' icerisinde sayi,harf,özel karakter alsada ascii tablosundaki sayisal degerleri de kullanabilir
        // ayni sekilde char data turundeki bir variable'i
        //matematiksel islemde kullanirsaniz
        //ascii tablosundaki degeri ile matematiksel isleme girer.
        char ch1 = 'a';
        int sayi1 = ch1;
        System.out.println("ch1 :" + ch1); // a
        System.out.println("sayi1 :" + sayi1); //97

        String str1 = "Java";
        String str2 = " ";
        String str3 = "Candir";
        System.out.println(str1 + str2 + str3); // Java Candir

        char ch2 = 'a';
        char ch3 = 'b';
        System.out.println(ch2 + ch3); //97+98=195 ascii tablosundan islem yapar


        int karakter = 97;
        char asciDegeri = (char)karakter;
        System.out.println("Verilen sayinin ascii tablosundaki karsiligi: " + asciDegeri); //a


    }
}
