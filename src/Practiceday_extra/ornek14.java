package Practiceday_extra;

import java.util.Scanner;

public class ornek14 {

    /*
       Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
        Örnek:
         char ch1= 'a'
        String name =     "Ali bakkala geç gitti."
        Beklenen Çıktı=    a sayısı = 3
        Ipucu:
        Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
        Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini
         Loop içindeki İf ile bulabilirsiniz!

     */

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz : ");
        String isim= scanner.nextLine();
        System.out.print("Lutfen bir karakter giriniz : ");
        char karakter=scanner.next().charAt(0);

        int sayac=0;
        int index=0;

        while (index<isim.length()){
            if (isim.charAt(index)==karakter){
                sayac++;
            }

            index++;
        }
        System.out.println(karakter + " sayısı = " + sayac);
    }
}
