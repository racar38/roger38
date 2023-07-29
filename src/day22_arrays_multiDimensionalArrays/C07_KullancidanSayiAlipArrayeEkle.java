package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KullancidanSayiAlipArrayeEkle {
    public static void main(String[] args) {

        int[]arr={3,5,8};

        // kullanicidan bir sayi alip
        // arr 'ye 4. element olarak ekleyin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen array'e eklemek istediginiz sayiyi giriniz");
        int eklenecekSayi=scanner.nextInt();

       arr=  C06_ArrayeBirElemanEkleme.arrayeBirElemanEkle(arr,eklenecekSayi);

       // 5. elaman olarak 11 ekleyin

        arr= C06_ArrayeBirElemanEkleme.arrayeBirElemanEkle(arr,11);

        System.out.println(Arrays.toString(arr));
    }

}
