package Practiceday_extra;

import java.util.Scanner;

public class hesapMakinesi {
    /*
            * Problem Tanımı :
      Basit 4 işlem yapan bir hesap makinesi kodlayınız.
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız. + - * %
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Lutfen yapmak istediginiz islemi seciniz\n: " +
                "Toplama islemi icin: '+'\n"+
                "Cikarma islemi icin: '-'\n"+
                "Carpma islemi icin: '*'\n"+
                "Bolme islemi icin: '/'\n");
        char karakter = scanner.next().charAt(0);
        switch (karakter){
            case '+':
                toplama();
                break;
            case '-':
                cikarma();
                break;
            case '*':
                carpma();
                break;
            case '/':
                bolme();
                break;
            default:
                System.out.println("Yanlis karakter secimi");
        }
    }
    private static void bolme() {
        System.out.println("Ikı adet sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        try {
            System.out.println(sayi1/sayi2);
        } catch (ArithmeticException e) {
            System.out.println("Bolunen sayi olarak 0 kullanilamaz");
        }
    }
    private static void carpma() {
        System.out.println("Ikı adet sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        System.out.println(sayi1*sayi2);
    }
    private static void cikarma() {
        System.out.println("Ikı adet sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        System.out.println(sayi1-sayi2);
    }
    private static void toplama() {
        System.out.println("Ikı adet sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        System.out.println(sayi2+sayi1);
    }

}
