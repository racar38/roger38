package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C02_IndirimHesaplama {
    public static void main(String[] args) {


        //- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun
        //. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");

        int urunadedi = scanner.nextInt();

        System.out.println("Lutfen liste fiyatini giriniz");

        double listeFiyati = scanner.nextDouble();
        System.out.println("Musteri kartiniz var mi ?  E:Evet , H:Hayir");
        char kartVarmi = scanner.next().toUpperCase().charAt(0);

        double toplamFiyat = urunadedi * listeFiyati; //bu sekilde atama yapilabilir yoksa da sout kisminda urunadedi*listefiyati seklinde tanimlanabilir

        if (kartVarmi == 'E') {                    //karti olanlar
            if (urunadedi > 10) {
                System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat * 0.8);
            } else {
                System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat * 0.85);
            }


        } else if (kartVarmi == 'H') {             // karti olmayanlar
            if (urunadedi > 10) {
                System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat * 0.85);
            } else {
                System.out.println("%10 indirimli toplam fiyat : " + toplamFiyat * 0.90);
            }


        } else {
            System.out.println("Hatali kart bilgisi");
        }
    }
}