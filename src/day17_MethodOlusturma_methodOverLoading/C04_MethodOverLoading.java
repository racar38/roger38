package day17_MethodOlusturma_methodOverLoading;

public class C04_MethodOverLoading {

    public static void main(String[] args) {

           /*
                Biz bir method call yaptigimizda
                java öncelikle method ismini kontrol eder
                Sonra argument olarak verilen degerler ile,
                parametre olarak yazilan variable'larin data turlerini karsilastirir
                ve uyumlu ise method'u calistirir
                argumentler ile parametreler uyumlu degil ise CTE verir

                Java'da ayni data turune ve parametre sayisina sahip
                birden fazla method olusturamazsiniz

                farkli data turlerinde parametreler varsa
                dizilis degistiirldiginde java farkli bir method olarak kabul eder
            */


        toplama(4, 6);    // 10

        //  toplama(5,6.3); intger sayi 6.3 olamaz bu yüzden yazmaz

        toplama(5.3, 6); // 11,3
        toplama(5, 2.4); // 7,4

        toplama(5.2, 6.7);  // 11,9
        toplama(3.4f,5); //   8.400000095367432   autoCasting yapar ve islem yapar 3. METHOD kendisine en az casting yapani kullanir akilli adamdir java

        toplama(2.3f,5f); // 7.299999952316284 2 double toplami  4.METHOD
    }


    public static void toplama(int sayi1, int sayi2) {                              // 1. METHOD

        System.out.println("iki integer'in toplami : " + (sayi1 + sayi2));
    }

    //public static void toplama(int a,int b){     // aynı data turu oldugu icin olusturmaz yukarıda mevcut

    public static void toplama(int a, double b) {                                   // 2. METHOD

        System.out.println("int ile double toplami :. " + (a + b));
    }

    public static void toplama(double b, int a) {                                   // 3. METHOD
        System.out.println("double ve int'in toplami : " + (a + b));
    }

    public static void toplama(double sayi1, double sayi2) {                         // 4.METHOD
        System.out.println("iki double toplami : " + (sayi1 + sayi2));
    }

    /*
       METHOD İSMİ + PARAMETRELERİN DATA TURLERİNE METHOD SİGNATURE DENİR. 4.method==> toplama double double vs

       Java ayni class'da signature'i ayni olan 2 method'a izin vermez

       Bir class'da ismi ayni fakat signature'i farkli birden fazla
       method olusturulmasina METHOD OVERLOADING denir
     */
}
