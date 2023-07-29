package day09_NestedIfElseStatements_Ternary;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_Emeklilil2inciCozum {

    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E:Erkek , K:Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");

        double yas = scanner.nextDouble();

        if (yas < 10 || yas > 80) {
            System.out.println("Gecersiz yas");
        } else if (yas < 60) {  // kimse emekli olamaz
            if (cinsiyet == 'K') {
                System.out.println("Kadin emekli olabilmek icin daha " + (60 - yas) + "yil daha calismasi lazim");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmek icin daha " + (65 - yas) + "yil daha calismasi lazim");
            } else {
                System.out.println("Cinsiyet hatali");
            }


        } else if (yas < 65) {  // sadece kadinlar emekli olabilir
            if (cinsiyet == 'K') {
                System.out.println("Kdin emekli olabilir");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmek icin daha " + (65 - yas) + "yil daha calismasi lazim");
            } else {
                System.out.println("Cinsiyet hatali");
            }// herkes emekli olabilir

        }else {
                if (cinsiyet == 'K' || cinsiyet == 'E') {
                    System.out.println("Emekli olabilir");
                }
            }
        }
    }
