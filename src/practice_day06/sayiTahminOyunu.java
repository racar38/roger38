package practice_day06;

import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu {

     /*
    Sisteme  bir sayi tanimlayip, kullanicidan sayi isteyerek
    Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
    bilince de tebrik edip durduran bir kod yazalim
     */

    public static void main(String[] args) {
        // int sayi=138; // bizim verdigimiz sayiya gore islem yaptik
        Random random=new Random();
        int sayi= random.nextInt(150); // 0-150 arasi bir sayi kendisi belirler
        System.out.println("Aklimdan bir sayi tuttum. Hadi tahmin et");
        Scanner scanner=new Scanner(System.in);
        boolean dogruMu=false;

        while(!dogruMu){
            int tahmin= scanner.nextInt();
            if (tahmin>sayi){
                System.out.println("Cok soyledin dusur");
            } else if (tahmin<sayi) {
                System.out.println("Dusuk soyledin arttir");
            } else if (tahmin==sayi) {
                System.out.println("Tebrikler kazandiniz ");
                dogruMu=true;                             // while true oldugu zaman while dongusu sonlanacaktir...
            }else{
                dogruMu=false;   //  while false oldugu surece while dongusu devam edecektir...
            }
        }
    }
}
