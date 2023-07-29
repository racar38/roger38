package Practiceday_extra;

import java.util.Scanner;

public class ornek18 {


    /*
            Soru 18-) Method Sorusu
        Girilen araç hızı ve yol kilometresinden,
        gidilen yere varış süresini hesaplayan bir method yazalım.
        Kullanıcıya hızını ve kilometreyi soralım,
        bunu methoda gönderelim ve bize varış süremizi hesaplasın

        İpucu:
        yol=Hız*zaman

     */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen hizinizi giriniz");
        double hiz= scanner.nextDouble();
        System.out.println("Lutfen kalan mesafeyi km olarak giriniz");
        double yol = scanner.nextDouble();

        varisSuresiHesabi(yol,hiz);

    }
    public static void varisSuresiHesabi(double yol,double hiz){

        double varisSuresi=yol/hiz;

        System.out.println("Gidilecek yere olan sure : " +varisSuresi+ " saat");
    }

}


