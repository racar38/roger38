package Practiceday_extra;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ornek31 {

    /*
    Kullanıcıdan Arrayin uzunlugunu isteyin.
Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
     */

    public static void main(String[] args) {

        System.out.println("Lutfen olusturmak istediginiz array uzunlugunu giriniz.");
        Scanner scanner=new Scanner(System.in);
        int uzunluk=scanner.nextInt();
        int[] liste=new int[uzunluk];
        System.out.println("Lutfen  arrayin degerlerini sıra ile giriniz");
        for (int i = 0; i <uzunluk ; i++) {
            int deger= scanner.nextInt();
            liste[i]=deger;
        }
        System.out.println(Arrays.toString(liste));
    }
}
