package day06_Concatenation_matematikselOperatorler;

public class C02_KarsilastirmaOperatorleri {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;

        // Javada = isareti karsilastirma degil atama isaretidir(assignment)

        b=2*a ;

        // Java'da esitligi kontrol etmek istersek == kullaniriz

        System.out.println(b==2*a); //20==20 b esittir 2a mı? diye sorulur //true

        // assignment'a esitligin sol tarafinda sadece variable bulunur
        //sol tarafinda matematiksel islem olmaz
        //karsilastirma operatorlerinde iki tarafta da islem olabilir
        System.out.println(3*b > 5*a ); // 60>50 true ==> true

        System.out.println(b>= b-a); // 20>= 10 ==> true

        System.out.println(a<= b-a); // 10<=10 true

        //Java'da karsilastirma operatorlerinde kullanilan (!)
        // boolean degeri tersine cevirir

        System.out.println(a<b); //true

        System.out.println(!   (a<b)  ); // true ==> false ! isareti terse cevirir

        System.out.println(a !=b); // true a b'ye esit degildir
        System.out.println(a!=b); //  true a esit degildir b!ye

        // != esit degildir demek
        // ! islemi terse cevirir yani !true ==> false demektir






    }
}
