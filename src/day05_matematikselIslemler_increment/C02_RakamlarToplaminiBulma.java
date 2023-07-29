package day05_matematikselIslemler_increment;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        // Kullacidan 3 basamaklı bir sayıyı alip sayının rakamlarını  toplayıp yazdırınız

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 3 basamakli pozitif bir tamsayi giriniz");

        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = 0;
        int rakamalarToplami = 0;

        // ilk sayi icin birler basamagini bulalim

        birlerBasamagi = girilenSayi % 10 ;

        rakamalarToplami = rakamalarToplami + birlerBasamagi ;

        // birler basamagindaki sayiyi aldik artik ondan kurtulalim

        girilenSayi = girilenSayi/10 ;

        // bu satira geldigimizde girilen sayiyi 2 basamakli hale donusturduk

        birlerBasamagi = girilenSayi % 10 ;

        rakamalarToplami = rakamalarToplami + birlerBasamagi ;

        girilenSayi = girilenSayi / 10 ;

        birlerBasamagi = girilenSayi % 10 ;
        rakamalarToplami = rakamalarToplami + birlerBasamagi ;

        System.out.println("Girilen sayinin rakamlari toplami :" + rakamalarToplami );


        int sayi = 10;
        sayi -= 2 ;
        System.out.println(sayi);



    }
}
