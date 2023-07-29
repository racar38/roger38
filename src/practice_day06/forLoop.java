package practice_day06;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class forLoop {

    /*
    SORU -1:
    Çarpım tablosunu ekrana yazdıran bir program yazın (örneğin 1x1'den 10x10'a kadar).
     */
    public static void main(String[] args) {
//
        //       for (int i = 1; i <=10 ; i++) {
        //           for (int j = 1; j <=10 ; j++) {
        //               System.out.println(i+"x"+j+"="+(i*j)+"\t");
        //           }
//
        //       }
        //   }
//
     /*
                Soru 2:
              Kullanıcıdan bir sayı girişi alın ve 1'den o sayıya kadar olan tek sayıları ekrana yazdırın.
     */

        //   Scanner scanner = new Scanner(System.in);
        //   System.out.println("Lutfen bir sayi giriniz");
        //   int sayi = scanner.nextInt();

        //   for (int i = 1; i < sayi; i++) {

        //       if (i % 2 == 1) {
        //           System.out.print(i+ " ");
        //       }
        //   }

          /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen baslangic ve bitis degeri icin pozitif sayilar giriniz");
        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();
        int toplam = 0;

       if (baslangic>bitis){
           System.out.println("bitis degeri baslangic degerinden kucuk olamaz");

       }else{

           for (int i = baslangic; i <=bitis ; i++) {

               toplam+=i;

           }
           System.out.println("baslangic ve bitis degerleri arasindaki sayilarin toplami : "+toplam);
       }

    }
}





