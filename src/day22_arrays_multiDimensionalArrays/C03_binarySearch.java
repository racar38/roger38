package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C03_binarySearch {

    public static void main(String[] args) {

        int[] arr = {0, 13, 4, 7, 10, 2, 1, 23};

        System.out.println(Arrays.binarySearch(arr, 13)); // -8

        System.out.println(Arrays.binarySearch(arr, 7)); // 3

        System.out.println(Arrays.binarySearch(arr, 10)); // -8

        System.out.println(Arrays.binarySearch(arr, 23)); // 7

        /*
        Binary yapisi cok buyuk datalari kolayca depolayabilmek icin
          Java'nin kullandigi bir yontemdir.

          Binary mantigi aranan sayinin kolayca bulunmasina dayanir.
          binarySearch'in saglikli islemesi icin
          oncelikle array'i kucukten buyuge dogru siralamalisiniz

          ** siralama yapmadan binarySearch kullanilirsa sonuc hicbir sey diyemeyiz...
          dogru da olabilir, yanlis da olabilir

         */

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 13)); // 6

        System.out.println(Arrays.binarySearch(arr, 7)); // 4

        System.out.println(Arrays.binarySearch(arr, 10)); // 5

        System.out.println(Arrays.binarySearch(arr, 23)); // 7

        // OLMAYAN BİR ELAMANI YAZDIRMAK ICIN;

        System.out.println(Arrays.binarySearch(arr, -5)); // -1   sayı yok olsa 0 dan önce olurdu o da -1

        System.out.println(Arrays.binarySearch(arr, 5)); // -5    sayı yok olsa 4 den sonra olurdu o da -(5. index)

        System.out.println(Arrays.binarySearch(arr, 25)); // -9 sayi yok olsa 23 den sonra olur o da -( 9. index)

        System.out.println(Arrays.binarySearch(arr, 44)); // -9 sayi yok olsa 23 den sonra olur o da -( 9. index)

    }
}
