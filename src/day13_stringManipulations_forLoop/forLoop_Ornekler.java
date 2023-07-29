package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class forLoop_Ornekler {

    public static void main(String[] args) {


        // SORU: Kullanicidan iki sayi alin ve bu sayilar dahil olarak
        // aralarindan 3 ie bolunebilen sayilari yazdirin
        // ilk girilen sayi ikinci girilen sayidan buyuk ise hata mesaji yazdirin

      Scanner scanner = new Scanner(System.in);
      System.out.println("Lutfen 2 pozitif tamsayi giriniz");
      int ilkSayi = scanner.nextInt();
      int ikinciSayi = scanner.nextInt();

      if (ilkSayi > ikinciSayi) {
          System.out.println("Ilk sayi daha kucuk olmalidir");
      } else {

          for (int i = ilkSayi; i <= ikinciSayi; i++) {

              if (i % 3 == 0) {

                  System.out.print(i + " ");

                }
            }


        }


    }
}

