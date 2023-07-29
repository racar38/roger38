package day08_IfElseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz ?");

        char girilenKarakter = scanner.next().charAt(0);

        // KULLANICI NE KADAR UZUN KELIME VEYA KELIMELER GIRSE DE OLK KARAKTERI ALIR...

        if (girilenKarakter >= 'A' && girilenKarakter <= 'Z') {

            System.out.println("Girilen karakter buyuk harf");

        } else {
            System.out.println("Girilen karakter buyuk harf degil");
        }
    }
}
