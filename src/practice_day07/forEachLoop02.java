package practice_day07;

import java.util.ArrayList;
import java.util.Scanner;

public class forEachLoop02 {

    // Bir ArrayList oluşturun ve içine çeşitli ürün fiyatları ekleyin.
// Bu fiyatların toplamını hesaplayarak ekrana yazdırın.

// Örnek çıktı:
// Toplam fiyat: 236.5

    public static void main(String[] args) {

        ArrayList<Double> fiyatlar=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.ÜRÜN SATIŞ FİYATINI GİRİNİZ : ");
        double urun1= scanner.nextDouble();
        fiyatlar.add(urun1);
        System.out.println("2.ÜRÜN SATIŞ FİYATINI GİRİNİZ : ");
        double urun2= scanner.nextDouble();
        fiyatlar.add(urun2);
        System.out.println("3.ÜRÜN SATIŞ FİYATINI GİRİNİZ : ");
        double urun3= scanner.nextDouble();
        fiyatlar.add(urun3);
        System.out.println("4.ÜRÜN SATIŞ FİYATINI GİRİNİZ : ");
        double urun4= scanner.nextDouble();
        fiyatlar.add(urun4);
        System.out.println("5.ÜRÜN SATIŞ FİYATINI GİRİNİZ : ");
        double urun5= scanner.nextDouble();
        fiyatlar.add(urun5);
        double toplam=0;
        for (double fiyat:fiyatlar
             ) {
            toplam+=fiyat;
        }
        System.out.println("Bugünkü satışların toplam cirosu : " +toplam);
    }
}
