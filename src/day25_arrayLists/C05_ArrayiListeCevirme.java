package day25_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArrayiListeCevirme {

    public static void main(String[] args) {

        Integer[] arr = {1,3,4,6,7,1,3,8,5,2,3,4,9,0,1,2,5,4,3,2};

        // Bu array'i bir list olarak kaydedin

        List<Integer> forList=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            forList.add(arr[i]);

        }
        System.out.println(forList);

         /*
            Arrays class'i bize verilen array'i list'e ceviren hazir bir method sunuyor

            ANCAKKKKK

            bu method'u kullanarak bir array'i list'e cevirmenin 2 buyuk dezavantaji var

            1- add() ve remove() gibi list'in uzunlugunu degistiren method'lari desteklemez
            2- her ne kadar biz bir list olusturmus olsak da
               java arka planda hazir method ile olusturulan list ve kaynak arr'yi ilisiklendirir
               birinde yapilan degisiklik, digerine de islenir
         */

        List<Integer> hazirMethodList= Arrays.asList(arr);
        System.out.println(hazirMethodList);

        forList.remove(3);
        System.out.println(forList);

       // hazirMethodList.remove(4); //  UnsupportedOperationException
       // System.out.println(forList);

        forList.set(0,10);
        System.out.println(forList);

        System.out.println(Arrays.toString(arr));

        hazirMethodList.set(0,20);
        System.out.println(hazirMethodList);
        System.out.println(Arrays.toString(arr));
    }
}
