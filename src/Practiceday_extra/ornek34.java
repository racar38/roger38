package Practiceday_extra;

import java.util.Arrays;

public class ornek34 {
    /*
    Soru 34-)
  Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran
  bir Method yazın.

   Örnek
   String str : ade1r4d3
   Int toplam : 8
   İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
                  Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
     */

    public static void main(String[] args) {

        String str = "ade1r4d3";
        String digits ="";
        int toplam = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);
            }
        }

        String[] strArr = digits.split("");
        System.out.println(Arrays.toString(strArr)); // kontrol amaçlı [1, 4, 3]

        for (int i = 0; i < strArr.length; i++) {
            toplam += Integer.valueOf(strArr[i]);
        }

        System.out.println("Girilen metindeki rakamlar toplami : " + toplam);
    }


}



