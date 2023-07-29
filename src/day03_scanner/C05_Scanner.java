package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
        //yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen dikdortgenin 2 kenarını giriniz");
        double ilkKenar = scanner.nextDouble();
        double ikinciKenar = scanner.nextDouble();

        System.out.println("Dikdortgenin alani:" + ilkKenar*ikinciKenar);
    }
}
