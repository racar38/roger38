package practice_day07;

import java.util.ArrayList;

public class forEachLoop01 {

    // Bir ArrayList oluşturun ve içine 3 adet meyve ekleyin.
// Daha sonra bu meyveleri büyük harflerle ekrana yazdırın.

// Örnek çıktı:
// Meyveler: ELMA ARMUT ÇİLEK

    public static void main(String[] args) {

        ArrayList<String> meyveler=new ArrayList<>();

        meyveler.add("Elma");
        meyveler.add("ArMuT");
        meyveler.add("ÇİLek");

        for (String meyve:meyveler   // meyve olarak variable otomatik olusturulur foreach loop da
             ) {
            System.out.println(meyve.toUpperCase());
        }
    }
}
