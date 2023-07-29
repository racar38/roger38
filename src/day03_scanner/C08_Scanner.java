package day03_scanner;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {

        //  (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //degerlerini degistirin(swap)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ilk sayiyi giriniz");
        int ilkSayi=scanner.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz");
        int ikinciSayi= scanner.nextInt();

        ilkSayi = ilkSayi + ikinciSayi ;
        ikinciSayi = ilkSayi - ikinciSayi;
        ilkSayi = ilkSayi - ikinciSayi ;


        System.out.println("İlk sayinin yeni değeri :" + ilkSayi);
        System.out.println("İkinci sayinin yeni değeri :" + ikinciSayi);


    }
}
