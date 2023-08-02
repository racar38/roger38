package Practiceday_extra;

import java.util.Arrays;
import java.util.Scanner;

public class ornek32 {
    /*
    Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
   İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin.
     */


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen array'in uzunlugunu giriniz");
        int uzunluk = scanner.nextInt();
        int[] liste=new int[uzunluk];
        System.out.println("Lutfen array'in degerlerini giriniz");

        for (int i = 0; i <uzunluk ; i++) {   // girilen i (index) degerlerini olusturdugumuz arrayin elamanlarina atiyoruz...
            int deger= scanner.nextInt();
            liste[i]+=deger;
        }
        System.out.println("Olusturulan Array : " + Arrays.toString(liste));
        int[] arrReverse=new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            arrReverse[i]=liste[liste.length-1-i]; // length-1  son indexi verir.. -1 azaltarak tersten yazdiriyoruz
        }
        System.out.println("Ters Array : " +Arrays.toString(arrReverse));
    }
}
