package day12_StringManipulation;

public class C04_nullPointer {

    public static void main(String[] args) {

        String str1;

        //System.out.println(str1);
        //str1.concat(" candir");


        str1 = "java";

        System.out.println(str1);   // java
        System.out.println(str1.concat(" candir"));  // java candir

       /*
         null bir deger degil pointer(isaretleyici)

         27.satir icin
         str2'nin degeri null veya str2 ye null degeri atanmis ifadeleri yanlıstir

         dogru olan ifade
         str2'ye deger atamadik bunun farkindayiz ve null olarak isaretlenmistir
        */
        String str2 = null;

        System.out.println(str2); //null
        System.out.println(str2 + " candir");  // null candir

        //System.out.println(str2.concat(" candir"));  //NullPointerException deger olmadigi icin bir methodda kullanamazsin

        // null bir method ile kullanilamaz kirmizi gostermez fakat sonuc da vermez sadece isaretleme yapar

        /* null atamasi yapilan bir variable, hic bir method ile KULLANILAMAZ!!!

       yazdirabilir veya + ile kullanilabilir

         */

        str2="tava";
        System.out.println(str2);

        String name = "Javasiz olmaz";
        System.out.println(name.replace('a', 'f'));
        System.out.println(name.replace("J", "K"));


    }
}
