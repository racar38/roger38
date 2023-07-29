package practice_day05;

import java.util.Scanner;

public class IstenenKadarYazdirma {

         /*
         * Kullanicidan 3 harften uzun bir kelime ve 10'dan kucuk bir sayi alin,
         * Kelimenin son 2 harfini girilen sayi kadar yan yana yazdirin(ilk girilen kelimenin üzerine ekleyerek yapin)
         */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 3 harften uzun kelime ve 10 dan kucuk sayi giriniz");

        String kelime=scanner.nextLine();
        int sayi= scanner.nextInt();

        String son2Harf=kelime.substring(kelime.length()-2);


        for (int i = 1; i <=sayi ; i++) {

            kelime+=son2Harf;


        }
        System.out.print(kelime);
    }

}
