package day08_IfElseIfStatements;

import java.util.Scanner;

public class C07_NestedIfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz K:KADIN , E:ERKEK");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();

        /*
            Birden fazla degisken varsa
            iclerinden birini biricil degisken olarak alip
            sadece ona gore bir if-else if-else kuralim

         */


       if (cinsiyet=='E'){

           if (yas<0 || yas>100){
               System.out.println("gecersiz yas girisi");
           } else if (yas>=65) {
               System.out.println("Erkek emekli olabilir");
           } else if (yas<65) {
               System.out.println("Erkek emekli olamaz : " + (65-yas) + " yil daha calismasi gerekli");
           }

       } else if (cinsiyet=='K') {
           if (yas<0 || yas>100){
               System.out.println("gecersiz yas girisi");
           } else if (yas>=60) {
               System.out.println("Kadin emekli olabilir");
           } else if (yas<65) {
               System.out.println("Kadin emekli olamaz : " + (60-yas) + " yil daha calismasi gerekli");
           }

       }else {
           System.out.println("Cinsiyet hatali girildi");
       }
    }
}
