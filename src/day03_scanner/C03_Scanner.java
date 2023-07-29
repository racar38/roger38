package day03_scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        // Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        //yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir double sayi giriniz");

        double girilenDouble = scanner.nextDouble();

        System.out.println("Lütfen bir  tamsayi giriniz");

        int girilenInt = scanner.nextInt();

        System.out.println("iki sayinin toplami :" + (girilenDouble + girilenInt));
        System.out.println("iki sayinin carpimi :" + girilenDouble * girilenInt);


    }

    }

