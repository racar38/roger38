package day06_Concatenation_matematikselOperatorler;

public class C04_Or_Operatoru {

    public static void main(String[] args) {

        /*
            Or operatoru iyimserdir
            Yani tek bir true bile yeterli olur
            or operatorunde tum mantıksal ifadeler false ise sonuc false
            degilse sonuc true'dur.

            (||) isareti veya anlamındadır

         */
        System.out.println(3>5 || 6>4 ); // false || true ==> true
        System.out.println(3<5 || 6>4); // true || true ==> true

        System.out.println(3<5 || 6<4 ); // true || false => true
        System.out.println(3>5 || 6<4); // false || false ==> false

        int sayi = 24;
        //sayi 3 veya 5 e bolunmelidir

        System.out.println(sayi%3 ==0 || sayi%5==0); // true || false ==> true

        // sayi 0'dan buyuk veya 100'den kucuk olmalidir
        System.out.println(sayi>0 || sayi<100 );

    }
}
