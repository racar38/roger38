package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class C03_ReplaceAll {

    public static void main(String[] args) {

        // kullanicidan bir metin isteyin
        // metindeki tum sayilari ve space disindaki özel karakterleri temizleyin
        //metnin sonuna da . koyun.
        // orenk input : "J1*2av4.a C67/an=+dir--"
        //       output : "Java Candir."

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");

        String girilenMetin= scanner.nextLine();

        // ONCE SAYİLARDAN KURTULALIM
        girilenMetin=girilenMetin.replaceAll("\\d","");

        System.out.println(girilenMetin); // J*av.a C/an=+dir--

        //ozel karakterlerden kurtulmak istedigimizde,space de kaybolur
        //bunun icin once space'i korumaya almaliyiz

        girilenMetin=girilenMetin.replaceAll("\\s","1");
        girilenMetin=girilenMetin.replaceAll("\\W","");     //Java1Candir

        System.out.println(girilenMetin);  //Java1Candir

        girilenMetin=girilenMetin.replaceAll("1"," ");

        girilenMetin=girilenMetin+ ".";
        System.out.println(girilenMetin);  //Java Candir.  istenilen cevaba bu sekilde ulasabiliriz.
    }
}
