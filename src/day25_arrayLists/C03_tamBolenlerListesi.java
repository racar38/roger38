package day25_arrayLists;

import java.net.http.WebSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_tamBolenlerListesi {

    public static void main(String[] args) {

        /*
        Verilen pozitif bir tamsayiyi ,o tam sayiyi tam bolebilen
        tum pozitif tamsayilari bir liste olarak bize donduren
        bir method olusturun
         */
        System.out.println(pozitifTamBolenlerListesi(20));
        System.out.println(pozitifTamBolenlerListesi(1345));


    }

    public static List<Integer> pozitifTamBolenlerListesi(int sayi){
        List<Integer> tamBolenlerListesi=new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                tamBolenlerListesi.add(i);
            }


        }
        return tamBolenlerListesi;
    }
}
