package Practiceday_extra;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ortakElementleriAyirma {

    public static void main(String[] args) {

        //  Verilen iki array'in elementlerini karsilastirip
        //  ikisinde ortak olan elementleri ayri bir liste olarak vermesini saglayin

        String[] str1={"Esra","Ali","Neriman","Fatma","Nergiz","Ahmet"};
        String[] str2={"ali","Ayse","Nergiz","Fatma","Ismail","Tarık"};

        ArrayList<String> ortakElementlerListesi=new ArrayList<>();

        for (String each1:str1
             ) {
            for (String each2:str2
                 ) {
                if (each1.equalsIgnoreCase(each2) && !ortakElementlerListesi.contains(each2)){
                   ortakElementlerListesi.add(each1);  // ortakElementlerListesi ne ekliyorum
                }


            }

        }
        System.out.println(ortakElementlerListesi);

    }
}
