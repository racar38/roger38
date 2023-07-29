package day06_Concatenation_matematikselOperatorler;

public class C03_AndOperatoru {
    public static void main(String[] args) {

        System.out.println(5> 3 && 6>4 ); // true (&&)  've' anlamına gelir.

        System.out.println(5<3 && 6>4 ); // false and true ==> false

        System.out.println(5>3 && 6<=4 ); // true and false ==> false

        System.out.println(5<=3 && 6<=4); // false and false ==> false

        /*
         && mukemmelliyetcidir.
            operatoru ile baglanan boolean ifadeler kac tane olursa olsun
           hepsi true ise sonuc true,
           bunun disindaki tum durumlarda false

           bu yonuyle matematiksel carpmaya benzer

           1*1*1*1*1*1*1 = 1
           1*0*1*1*1*1*1 = 0
           1*0*0*0*0*0*0 = 0 olur ...

           &==> tum islem bittikten sonra sonucu atama yapar (islem gec surer )
           && ==> ilk false degeri ile sonucun false olacagini mantiksal olarak algilayip hemen atama yapar
            ( islem cok hizlidir)

         */

        // bir sayinin hem 2 hem 3 hem de 5 ile bolunebilmesi lazim

        int sayi =24;

        System.out.println( sayi %2 ==0 && sayi %3 ==0 && sayi%5==0); // false
        //                     true           true           false

        // sayi 0 veya daha buyuk ve 100 veya daha kucuk olmalidir
        System.out.println(sayi>=0 && sayi<=100 ); //true
                      //       true       true
    }
}
