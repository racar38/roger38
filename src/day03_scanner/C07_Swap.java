package day03_scanner;

import java.util.Scanner;

public class C07_Swap {

    public static void main(String[] args) {

        //  (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ilk sayiyi giriniz");

        int ilkSayi = scanner.nextInt();

        System.out.println("Lütfen ikinci sayiyi giriniz");

        int ikinciSayi = scanner.nextInt();

        int temp = ilkSayi ;
        ilkSayi=ikinciSayi;
        ikinciSayi=temp;

        System.out.println("ilk sayinin yeni degeri:" +ilkSayi);
        System.out.println("ikinci sayinin yeni degeri :"+ikinciSayi);









    }
}
