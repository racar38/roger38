package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_List {

    public static void main(String[] args) {

        /*
           Bir List Olusturmak İcin;
           < > icerisine data turu yazilmalidir
           data turu PRIMITIVE data turleri OLAMAZ
         */

        List<String> isimler = new ArrayList<>();

        ArrayList<String> isimler2 = new ArrayList<>();
        // ikinci yazim bicimi cok kullanilmaz

        //Her list olusturuldugunda bos olarak olusturulur
        //sonra elementler tek tek eklenir

        System.out.println(isimler); // []

        isimler.add("burhan");
        isimler.add("seref");
        isimler.add("gulsah");

        System.out.println(isimler); //[burhan, seref, gulsah]

        //elementler ekleme sırasina gore dizilir

        // eger en sona degilde istedigimiz bir index'e element eklemek istersek

        isimler.add(2, "nergiz");

        System.out.println(isimler); // [burhan, seref, nergiz, gulsah]  elementleri bir sonrakine kaydirir
        isimler.add(1, "omer");
        System.out.println(isimler); // [burhan, omer, seref, nergiz, gulsah]  // burhan-seref arasina konuldu

        isimler.addAll(2, isimler);

        System.out.println(isimler);  // [burhan, omer, burhan, omer, seref, nergiz, gulsah, seref, nergiz, gulsah]

        System.out.println(isimler.add("Eyup"));  // true

        System.out.println(isimler); // [burhan, omer, burhan, omer, seref, nergiz, gulsah, seref, nergiz, gulsah, Eyup]


    }
}
