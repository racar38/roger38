package Practiceday_extra;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ornek33 {
    /*
          Array kullanarak String bir cümleyi Reverse eden (tersine çeviren)
          bir Java programı yazın (boşluklar ve özel karakterler dahil).
      Örnek:
      String str=''Kodlama harika.''
      String arr[]: ".etaerg si gnidoC"
      İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
     */

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen terse cevrilecek metni giriniz");
        String metin= scanner.nextLine();

        String[] arr=metin.split("");
        String[] tersArr=new String[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            tersArr[arr.length-1-i]=arr[i];

        }
        for (int i = 0; i <tersArr.length ; i++) {

            System.out.print(tersArr[i]);
        }
    }
}
