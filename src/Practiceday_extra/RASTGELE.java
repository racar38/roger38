package Practiceday_extra;

import java.util.Scanner;

public class RASTGELE {

    public static void main(String[] args) {

      /*  // en buyuk sayiyi donduren method yazdirin

        int[] arr = {2, 4, 6, 8, 1, 3, 7, 5};


        System.out.println(enBuyukSayi(arr));
    }

    public static int enBuyukSayi(int[] arr) {

        int enBuyukSayi = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > enBuyukSayi) {
                enBuyukSayi = arr[i];

            }

        }

        return enBuyukSayi;

    }

       */

        Scanner scanner;
        int sayi=103;

        while (sayi>=100 && sayi<1000){

            System.out.println("Luffen 3 basamakli bir sayi giriniz");
            scanner=new Scanner(System.in);
            sayi=scanner.nextInt();

            if (sayi>=1000 || sayi<100){
                System.out.println("3 basamakli sayi giriniz");

            }else{
                if (sayi%11==0){
                    System.out.println("Sayi 11 ile tam bolunebilir");
                }else{
                    System.out.println("Sayi 11 ile tam bolunmemektedir");
                }
            }
            sayi++;

        }


    }


}

