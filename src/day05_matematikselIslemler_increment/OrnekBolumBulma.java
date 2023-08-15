package day05_matematikselIslemler_increment;

import java.util.Scanner;

public class OrnekBolumBulma {

    /*
    // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
// kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
     */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bolunen sayiyi giriniz ? : ");
        int bolunen= scanner.nextInt();
        System.out.println("Lutfen bolen sayiyi giriniz ? : ");
        int bolen= scanner.nextInt();
        int sayac=0;

        while (bolunen>=bolen){

            bolunen-=bolen;
            sayac++;
        }
        System.out.println("Kalan sayi : "+bolunen);
        System.out.println("Bolum : "+sayac);

    }
}
