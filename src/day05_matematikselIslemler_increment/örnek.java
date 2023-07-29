package day05_matematikselIslemler_increment;

import java.util.Scanner;

public class örnek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 3 basamakli bir pozitif tam sayi giriniz");
        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        birlerBasamagi = girilenSayi %10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        girilenSayi = girilenSayi/10;


        birlerBasamagi= girilenSayi %10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi ;

        girilenSayi = girilenSayi/10;

        birlerBasamagi = girilenSayi %10 ;
        rakamlarToplami = rakamlarToplami +birlerBasamagi;
        girilenSayi = girilenSayi/10;

        System.out.println("Girilen 3 basamakli sayinin rakamlari toplami :" + rakamlarToplami);


    }
}
