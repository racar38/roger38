package Practiceday_extra;

import java.util.ArrayList;
import java.util.Scanner;

public class ornek36 {

    /*
       Soru 36-)
   Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
   ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
   Örnek:
   inputarr[]=   {1,2,3,4,5,6,7}
   output:         4
   İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
   Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir,
   Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Array'in uzunlugunu giriniz");
        int uzunluk=scanner.nextInt();
        int[] olusturulanArray=new int[uzunluk];
        System.out.println("Lutfen Array degerlerini giriniz");
        for (int i = 0; i <uzunluk ; i++) {
            int deger= scanner.nextInt();
            olusturulanArray[i]+=deger;
        }
        ortadakiElement();



    }

    public static void ortadakiElement() {


    }
}
