package day08_IfElseIfStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {

        // Kullaniciddan bir tamsayi isteyiniz
        // sayi 3'e bolunuyorsa 3'un kati
        // sayi 5'e bolunuuyorsa 5'in kati
        // ikisine birden bolunuyorsa sauper sayi
        // ikisine de bolunmuyorsa yaramaz sayi yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");

        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0 && girilenSayi % 5 == 0) {
            System.out.println("girilenSayi : super sayi");
        } else if (girilenSayi % 3 == 0) {

            System.out.println("girilenSayi : 3'un kati");

        } else if (girilenSayi % 5 == 0) {
            System.out.println("girilenSayi : 5'in kati");

        } else {
            System.out.println("girilenSayi: yaramaz sayi");
        }
    }
}
