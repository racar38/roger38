package practice_day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class odev {

    // Bir ArrayList oluşturun ve içine 3 adet renk ekleyin.
    // Daha sonra kullanıcıdan bir renk adı alın ve bu rengin ArrayList'te olup olmadığını ekrana yazdırın.

    // Örnek çıktı:
    // Aranan renk: Mavi
    // Sonuç: Renk bulunamadı.


    public static void main(String[] args) {
        ArrayList<String> renkler = new ArrayList<>();

        renkler.add("Yeşil");
        renkler.add("Sarı");
        renkler.add("Kırmızı");

        System.out.println(renkler);   // kontrol amaçlı [Yeşil, Sarı, Kırmızı]

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen renk ismi giriniz : ");
        String renk = scanner.nextLine();


       /*
        for (String each : renkler
        ) {

            if (renk.equalsIgnoreCase(each)) {
                System.out.println("Aradığınız renk ArrayList'te mevcuttur.");
                break;
            } else {
                System.out.println("Aradığınız renk bulunamadı.");
                break;
            }
        }
        */

        boolean kontrol=false;
        for (int i = 0; i <renkler.size() ; i++) {

            if (renk.equalsIgnoreCase(renkler.get(i))){
                System.out.println("Aradığınız renk Array'de mevcuttur.");
                kontrol=true;
                break;
            }
        }
        if (!kontrol){
            System.out.println("Aranan renk: " +renk);
            System.out.println("Sonuç: Renk bulunamadı.");
        }
    }
}
