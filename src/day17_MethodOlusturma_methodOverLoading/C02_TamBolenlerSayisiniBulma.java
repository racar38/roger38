package day17_MethodOlusturma_methodOverLoading;

import java.util.Scanner;

public class C02_TamBolenlerSayisiniBulma {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        //        bolenleri sayisini bulup bize donduren bir method olusturun.

        // ornek: 20 pozitif tam bolenleri : 1,2,4,5,10,20

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println(tamBolenlerSayisi(sayi));

    }

    public static int tamBolenlerSayisi(int sayi) {

        int sayac = 0;
        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0) {
                sayac++;
            }
        }
        return sayac;

    }
}
