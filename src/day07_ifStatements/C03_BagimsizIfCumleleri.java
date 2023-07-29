package day07_ifStatements;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // soru-1 Kullanicidan bir pozitif tamsayi isteyin,
        //        sayiyi kontrol edip 5 ile bolunebiliyorsa "sayi 5 'in tam kati" yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanicidan bir pozitif tam sayi isteyiniz");

        int a = scanner.nextInt();

        if ( a %5 ==0){

            System.out.println("Sayi  5'in tam kati");
        }
    }
}
