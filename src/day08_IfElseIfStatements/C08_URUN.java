package day08_IfElseIfStatements;

import java.util.Scanner;

public class C08_URUN {
    public static void main(String[] args) {


        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Müsteri kartın varmı E:EVET H:HAYIR");

        char kartVarmi = scanner.next().toUpperCase().charAt(0);

        System.out.println("Urun adedini giriniz");

        int urunAdedi = scanner.nextInt();

        System.out.println("Urun fiyatini giriniz");

        double urunFiyati = scanner.nextDouble();

        double toplamFiyat=0;

        if (kartVarmi=='E'){

            if (urunAdedi>10){
                System.out.println("%20 INDIRIMLI TOPLAM FIYAT : " + urunAdedi*urunFiyati*0.80);
            } else {
                System.out.println("%15 INDIRIMLI TOPLAM FIYAT : " + (urunAdedi*urunFiyati*0.85));
            }
        } else if (kartVarmi=='H') {

            if (urunAdedi>10){
                System.out.println("%15 INDIRIMLI TOPLAM FIYAT : " + urunAdedi*urunFiyati*0.85);
            } else {
                System.out.println("%10 INDIRIMLI TOPLAM FIYAT : " + (urunAdedi*urunFiyati*0.90));
            }

        }else {
            System.out.println("gecersiz giris yaptiniz");
        }
    }
}                               