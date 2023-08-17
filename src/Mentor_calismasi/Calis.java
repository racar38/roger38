package Mentor_calismasi;

import java.sql.SQLOutput;

public class Calis {
    public static void main(String[] args) {
        YazilimGelistirme yg = new FrontEnd();
        System.out.println(yg.isim + " " + yg.kodYaz());
    }
}
/*
    Variable için; Eger constructor ve data turu farkli ise
        objenin ozelliklerini aramaya DATA TURU olan class'dan baslanir
        EGER ozellikler variable olarak olusturuldu ise
        objenin ozelliklerini DATA TURU belirler...
         METHOD ICIN INHERITANCE :
        constructor ve data turu ayni ise ilk bulunan deger gecerlidir
        constructor ve data turu ayni degil ise
        aramaya data turu olan class'dan baslanir ve bulunamazsa direk CTE verir, aramaya devam etmez.
        Eğer o class'da bulunursa, bulunan class'dan constructor'in oldugu class'a kadar
        bu ozelligin daha guncel hali var mi diye kontrol edilir
        ve varsa en guncel hali yazilir.

 */