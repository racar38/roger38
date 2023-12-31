package day17_MethodOlusturma_methodOverLoading;

public class C05_MethodOverLoading {

    public static void main(String[] args) {

        /*
          method overloading olan bir class'da
          hangi methodun calisacagina karar vermek icin
          sagidaki siralamaya gore method'lar incelenir

          1-isim
          2-parametre sayisi
          3-argument-parametre uyumu
          4-minimum casting
         */

        toplama('s'); // tek int girilirse  2 kati yazilir : 230
        toplama(3,4); // iki integer'in toplami : 7
        toplama('a','b'); // iki integer'in toplami : 195

    }
    public static void toplama(int sayi1, int sayi2) {

        System.out.println("iki integer'in toplami : " + (sayi1 + sayi2));
    }
    public static void toplama(double sayi1, double sayi2) {
        System.out.println("iki double toplami : " + (sayi1 + sayi2));
    }
    public static void toplama(double b, int a) {
        System.out.println("double ve int'in toplami : " + (a + b));
    }

    public static void toplama(int sayi){
        System.out.println("tek int girilirse  2 kati yazilir : " + 2*sayi);
    }

    public static void toplama(int a,int b,int c){
        System.out.println("3 int toplami : " + (a+b+c));
    }
    public static void toplama(double a,double b, double c){
        System.out.println("3 double toplami : " + (a+b+c));
    }

}
