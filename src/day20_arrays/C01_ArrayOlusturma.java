package day20_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturma {

    public static void main(String[] args) {


        int[] sayilar={2,4,6,7,8};
        String harfler []={"a","f","e"};  // bu sekilde de yazım yapilabilir [] sonda kullanilarak

        System.out.println(sayilar[1]); //4
        System.out.println(harfler[2]); //e

        String[] ogrenciList={"Burhan","Ramazan","Samet","Senol"};

        System.out.println(ogrenciList[1]); // Ramazan

        // 5 kisilik bir sinif olusturun

        String[] sinifListesi= new String[5];

        /*
          bir array olusturulurken 2 sey mutlaka belirtilmelidir
          1-icine konulacak datalarin turu
          2-arrayin uzunlugu (Bir array'e olusturulurken yazilan uzunlugundan
                                daha fazla element konulamaz)
         */

        //bir array'in tumunu nasil yazdirabiliriz

        for (int i = 0; i <sayilar.length ; i++) {

            System.out.println(sayilar[i]+ "");
        }

        // array'in tamamini yazdırmak isterseniz
        // Arrays class'indan hazir method kullanilir

        System.out.println(Arrays.toString(sayilar)); // [2, 4, 6, 7, 8]

        //for loop ile elementleri yazdiririz
        //Arrays.toString() ise bize array'in kendisini yazdirir

        System.out.println(Arrays.toString(harfler)); // [a, f, e]

        int[] notlar=new int[4];
        System.out.println(Arrays.toString(notlar)); // [0, 0, 0, 0]



    }
}
