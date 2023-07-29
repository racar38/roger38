package Practiceday_extra;

import java.util.Scanner;

public class ornek6 {

    public static void main(String[] args) {

        //Soru-2)   SOUT/SYSO
        //Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
        //Ipuclari:
        //* Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
        //* Dikdortgenin Alani : uzun kenar * kisa kenar

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uzun kenari giriniz");
        double uzunKenar = scan.nextDouble();
        System.out.println("Lutfen kisa kenari giriniz");
        double kisaKenar = scan.nextDouble();

        System.out.print("Dikdortgenin Cevresi : " + 2 * (uzunKenar + kisaKenar));
        System.out.println("");
        System.out.println("Dikdortgenin Alani : " + uzunKenar * kisaKenar);
    }
}
