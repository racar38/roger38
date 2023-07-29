package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C03_OrtakElementleriBulma {
    public static <Liste> void main(String[] args) {

        /*
        Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
        ayri bir liste olarak veren bir program yazin.
         */

        Integer[] arr1={3,5,8,1,2,6,2,3,5,4,8};
        Integer[] arr2={5,2,5,2,0,9,6,7,8,1,5,7};

        // 2 array'in elementlerini bana getirmesi icin ic ice 2 for-each loop olsuturalim
        //elementleri karsilastirip, eger esitlerse ve daha önce listeye eklenmemisse listeye ekleyelim

        List<Integer> ortakElamanlarListesi= new ArrayList<>();

        for (Integer each1:arr1
             ) {
            for (Integer each2:arr2
                 ) {

                if (each1==each2 && !ortakElamanlarListesi.contains(each1)){
                    ortakElamanlarListesi.add(each1);
                }
            }

        }
        Collections.sort(ortakElamanlarListesi);
        System.out.println(ortakElamanlarListesi);
    }
}
