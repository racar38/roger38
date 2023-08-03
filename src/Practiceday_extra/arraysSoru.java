package Practiceday_extra;

import java.util.ArrayList;
import java.util.Arrays;

public class arraysSoru {

    //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip, -
    // Kelimenin uzunlugu cift sayi ise ilk yarisini -
    // Kelimenin uzunlugu tek sayi ise
    // ortadaki harf dahil ikinci yarisini yeni bir listeye ekleyip yazdirin.

    public static void main(String[] args) {

        String[] str={"ayse","fatma","hayriye","necati","resul"};

        ArrayList<String> yeniListe=new ArrayList<>();
        for (String each:str
             ) {

            if (each.length()==0){

                yeniListe.add(0,each.substring(each.length()/2));

            }else{
                yeniListe.add(each.substring((each.length()-1)/2));

            }

        }
        System.out.println("istenilen yeniArr : " +yeniListe);
    }
}
