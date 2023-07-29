package day18_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class ORNEKLERRR {


    public static void main(String[] args) {

      //Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        // Kullaniciya bitirmek
        //istediginde 0'a basmasini soyleyin
        //Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        //bunlarin toplaminin kac oldugunu yazdirin
        //Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        //negatif sayiyi sayi adedine ve toplama eklemeyin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif tam sayilar giriniz");
        int sayi= scanner.nextInt();
        System.out.println("Bitirmek icin 0'a basiniz");

        int toplam=0;
        int sayac=0;

        while(sayi!=0){

        toplam+=sayi;
        sayac++;

        if (sayi!=0){
            System.out.println("Girilen " + sayac +"adet sayinin toplami : " + toplam);
        }

        }

    }
}


