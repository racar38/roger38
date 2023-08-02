package Practiceday_extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ornek30 {

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
        char[] karakter=str.toCharArray();
        System.out.println(Arrays.toString(karakter));

        List<String> tekrarEdenKarakterler=new ArrayList<>();

        for (int i = 0; i < karakter.length ; i++) {

            for (int j = i+1; j < karakter.length ; j++) {

                if (karakter[i]==karakter[j] && !tekrarEdenKarakterler.contains(String.valueOf(karakter[i]))){

                    tekrarEdenKarakterler.add(String.valueOf(karakter[i]));
                }
            }

        }
        System.out.println(tekrarEdenKarakterler);
    }

}
