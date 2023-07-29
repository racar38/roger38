package proje_practice;

import java.util.*;

public class Q1 {

    public static void main(String[] args) {

        /*
        1. SORU
        Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
        Örnek: 12 = 1 1 0 0
         */

        System.out.print("Desimal deger giriniz: ");
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        System.out.println(sayi+" desimal sayisinin binary karsiligi : " + binaryConvert(sayi));

    }

    public static List<Integer> binaryConvert(int sayi){

        List<Integer> binary=new ArrayList<>();   // soruda istenen binary degere cevirdik
        while (sayi>0){
            binary.add(sayi%2);
            sayi/=2;
        }
       List<Integer> tersBinary=new ArrayList<>();  // cıkan binary degeri terse cevirmek istersek

        for (int i = binary.size()-1; i >=0 ; i--) {
            tersBinary.add(binary.get(i));

        }

        // Collections.reverse(binary); kısa yol olarak da yapilabilir...for loop gerek kalmadan
        return tersBinary;   // binary dersek sorunun cevabini tersBinary dersek cevabi tersten yazdirir...
    }
}
