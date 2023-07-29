package day05_matematikselIslemler_increment;

import com.sun.tools.javac.Main;

public class C04_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        // Java'da bir onceki class'da yaptigimiz gibi
        //artirma ve atama , veya artirma ve yazdirma beraber olabilir

        int a=20;

        int b = 10;

        System.out.println(b = 2*a); //40

        System.out.println(a = b-5); //35

        a=10;
        // önce a'nin degerini b'ye atayin , sonra a'yi artiin

        b = a++;
        System.out.println("a:" + a + "b:" +b);

        // once a'nin degerini bir artirin sonra a'nin degerini b'ye atayin

        b= ++a;
        System.out.println("a:" + a + "b:" +b);

        /*
        bu kullanim a++, a--, --a, ++a, icin gecerlidir
        burada ++ veya --'yi once mi yoksa sonra mi kullanacagimiza
        bizden istenen duruma göre karar veririz

        artirma once ise ++a
        artirma sonra ise a++ seklinde olur

         */

        a=20;
        System.out.println(a++); // artırma sonra oldugu icin önce a!yazdirir sonra artirir
        System.out.println(a);

        a = 20;
        System.out.println(--a);
        System.out.println(a);


    }
}
