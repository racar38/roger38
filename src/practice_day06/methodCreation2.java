package practice_day06;

import java.util.Scanner;

public class methodCreation2 {

    /*
    Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    isim bosluk soyisim seklinde bize donduren bir method olusturun
     */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz : ");
        String isim= scanner.nextLine();
        System.out.print("Lutfen soyisminizi giriniz : ");
        String soyisim=scanner.nextLine();

        System.out.println(IsimSoyisimDuzenleme(isim,soyisim));

    }

    public static String IsimSoyisimDuzenleme( String isim,String soyisim){

        isim=isim.substring(0,1).toUpperCase()+ isim.substring(1).toLowerCase(); // CharAt(0) olarak da yazilabilir
        soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase(); // CharAt(0) olarak da yazilabilir

        String istenenMetin=isim+ " " +soyisim;
        return istenenMetin;
    }


}

