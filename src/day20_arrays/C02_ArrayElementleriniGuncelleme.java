package day20_arrays;

import java.util.Arrays;

public class C02_ArrayElementleriniGuncelleme {

    public static void main(String[] args) {

        int[] sayilar=new int[6];

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0, 0, 0, 0]

        // 2. indexdeki elementi 5 yapin

        sayilar[2]=5;

        System.out.println(Arrays.toString(sayilar)); //[0, 0, 5, 0, 0, 0]

        // index kullanmadan bir elemente atama yapmak mumkun degildir

        //5.index deki elementi 8 yapim
        sayilar[5]=8;
        System.out.println(Arrays.toString(sayilar)); // [0, 0, 5, 0, 0, 8]

        // 6.index'e yeni bir element ekleyelim
        sayilar[6]=20; // 6 indexin dısında haberin olsun diyor // .ArrayIndexOutOfBoundsException
        //Run time error denilir

        // CTE alti çizili olursa verir çalışmaz
        //RTE run dedikten sonra veriri çalıştırır

        // uzunlugu verilen bir array'e
        // yeni element ekleyip uzunlugunu degistirmek isterseniz
        // RunTimeError olusur

    }
}
