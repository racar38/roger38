package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C05_varOlanArrayeYeniDegerAtama {

    /*
    var olan bir array'e length olarak belirlenen den
       daha fazla element ATANAMAZ

        ANCAK
        var olan bir array'e
        baska bir array'i deger olarak ATAYABILIRIZ

     */
    public static void main(String[] args) {
        int[] arr={3,4,5,6,8,1};
        System.out.println(arr.length); //6

        // 7. elementi bu array'e atayabilir miyiz?
        // arr[6]=13;  .ArrayIndexOutOfBoundsException

        arr=new int[8];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0, 0, 0]
        String[] harfler={"a","n","y"};
        String[] yeniHarfler={"k","l","m","n"};

        harfler=yeniHarfler;

        System.out.println(Arrays.toString(harfler));  // [k, l, m, n]

        System.out.println(Arrays.toString(yeniHarfler)); // [k, l, m, n]

        //Eger var olan bir array'e yeni deger atamasi icin
        // liste yazmak istiyorsak asagidaki gibi atama yapabiliriz

         harfler= new String[]{"x"};
         System.out.println(Arrays.toString(harfler));  // [x]


    }

}
