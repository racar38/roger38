package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C05_Runner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> Liste=new ArrayList<>();
        Random random=new Random();


             C04                obje     =        new          C04();
        // classAdi/data turu   isim   atama    keyword      constructor

        System.out.println(obje.hiz); // 0
        System.out.println(obje.kapasite); // 0
        System.out.println(obje.ogrenciIsmi); // null
        System.out.println(obje.sayi); // 10
        obje.method1(); // method1 calisti

    }

    /*
    herhangi bir class'in icinden baska bir class'daki
    class uyelerine (variable,method.vb) ulasmak isterseniz
    hedef class'dan bir obje olusturabilirsiniz

    Java'da bir class'dan obje olusturmak istediginizde
    MUTLAKA bir constructor calisir

    Java da objeler class'lardan uretilir.
    class'larda obje uretebilmesi icin CONSTRUCTOR olmalidir
    Java bunu bildigi icin,olusturulan her class'a
    obje olusturulmasini saglayan DEFAULT CONSTRUCTOR yerlestirir.

     DEFAULT CONSTRUCTOR gorunmez,
     parametresizdir ve body'sinde kod yoktur.

     ONEMLİİİ
     bir class da gorunur bir constructor yoksa o class da DEFAULT CONSTRUCTOR vardir
     Gorunur bir constructor varsa
     Java default constructor'i siler...
     */

}
