package day08_IfElseIfStatements;

import java.util.Scanner;

public class C04_IfElseIfStatements {
    public static void main(String[] args) {


        // Kullaniciddan bir tamsayi isteyiniz
        // sayi 3'e bolunuyorsa 3'un kati
        // sayi 5'e bolunuuyorsa 5'in kati
        // ikisine birden bolunuyorsa sauper sayi


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("super sayi");
        } else if (sayi % 3 == 0) {
            System.out.println("3'un kati");
        } else if (sayi % 5 == 0) {
            System.out.println("5'in kati");
        }
    }
}
