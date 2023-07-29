package Practiceday_extra;

import java.util.Scanner;

public class ornek28 {
    /*
         Soru-28)
     Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
     Örnek:
           Sayı: 1238
           Sayının Tersi: 8321
     İpucu:  Loop kullanabilirsiniz.
     */

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen tersini yazdirmak istediginiz sayiyi giriniz");
        int sayi= scanner.nextInt();

        String yeniSayi=""+sayi;


        for (int i = yeniSayi.length()-1; i >=0 ; i--) {

            System.out.print(yeniSayi.charAt(i));

        }

    }
}
