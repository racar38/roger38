package day07_ifStatements;

import java.util.Scanner;

public class C11_IfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char karakter=scanner.next().charAt(0);

        if ('a'<=karakter && karakter<='z'){
            System.out.println("Girilen kucuk harfin yeni hali :" + Character.toUpperCase(karakter));
        } else {
            System.out.println("Girilen karakter: " + karakter);
        }

    }
}
