package day07_ifStatements;

import java.util.Scanner;

public class C06_BagimsizIfCumleleri {
    public static void main(String[] args) {

        // soru 6  : Kullanicidan pozitif bir tamsayi isteyin
        //           sayi 3 ve ya 5 ile bolunebiliyorsa
        //           "Guzel sayi" yazdirin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");

        int girilenSayi=scanner.nextInt();

        if (girilenSayi%3 ==0 || girilenSayi%5==0) System.out.println("Guzel sayi");
    }
}
