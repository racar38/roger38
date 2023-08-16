package Practiceday_extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class calismaaa {
     /*
           Soru 30-)
       Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
       ( mülakat sorusu )
       Örnek:
       String str="Javacokkolay"
       Yinelenen karakterler : [a, o, k]
       İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
     */
     public static void main(String[] args) {

         String str="Javacokkolay";
         String [] harfler=str.split("");
         System.out.println(Arrays.toString(harfler));

         List<String> tekrarEdenlerListesi=new ArrayList<>();

         for (int i = 0; i <harfler.length ; i++) {

             for (int j = i+1; j < harfler.length ; j++) {

                 if (harfler[i].equals(harfler[j]) && !tekrarEdenlerListesi.contains(harfler[i])){
                     tekrarEdenlerListesi.add(harfler[i]);
                 }

             }

         }
         System.out.println(tekrarEdenlerListesi);


     }
}
