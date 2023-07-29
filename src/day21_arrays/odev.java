package day21_arrays;

import java.awt.font.FontRenderContext;
import java.util.Arrays;
import java.util.Scanner;

public class odev {

    public static void main(String[] args) {

       /*
       Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip yazdirin

       int[]arr={3,4,6,8,1};

       for (int i = 0; i <arr.length ; i++) {

           arr[i]+=2;
       }
       System.out.println(Arrays.toString(arr));

        // Verilen arrayin tum elementlerini
        //artis miktari kadar artirin

        int[] arr={3,5,2,7};
        int artis=3;

        for (int i = 0; i <arr.length ; i++) {

            arr[i]+=artis;
        }
        System.out.println(Arrays.toString(arr));

        // verilen bir array deki pozitif tamsayilari toplayip sonucu yazdirin

        int[] arr = {-4, 5, 2, 0, 3,9};

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>0){

               toplam+=arr[i]; // toplam=toplam+arr[i];
            }

        }
        System.out.println("Array'deki pozitif tamsayilarin toplami : " + toplam);

        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdirin

        int[] arr = {3, 5, 2, 3, 5, 6, 7, 1, 8};
        int arananSayi = 5;

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arananSayi) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println("Aradiginiz element array de bulunmamaktadir");
        } else {
            System.out.println("Aradiginiz " + arananSayi + " elementi array de " + sayac + " kere kullanilmistir");

        }

        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i yazdirin


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen array'in uzunlugunu giriniz");
        int uzunluk = scanner.nextInt();
        int[] arr=new int[uzunluk];

        for (int i = 0; i <arr.length ; i++) {

            Scanner scanner1=new Scanner(System.in);
            System.out.println("Lutfen arrayin elementlerini girininiz");
            arr[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        */


    }
}
