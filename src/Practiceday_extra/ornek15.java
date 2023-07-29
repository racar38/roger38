package Practiceday_extra;

import java.util.Scanner;

public class ornek15 {

    /*Soru 15-)  Kullanıcıdan en az 5 harfli bir kelime alın.
            Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
            Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
            Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
            Loopun içerisinde StringM methodlarından  yararlanalım!*/

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String metin="";

        while(metin.length()<5){
            System.out.println("Lutfen en az 5 harfli  bir kelime giriniz");
            metin= scanner.nextLine();
        }

        String son3karakter=metin.substring(metin.length()-3);
        String istenenMetin=son3karakter+son3karakter;
        System.out.println("Son 3 Harfin Kopyali Hali : " + istenenMetin);
    }
}
