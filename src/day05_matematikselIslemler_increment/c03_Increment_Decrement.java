package day05_matematikselIslemler_increment;

public class c03_Increment_Decrement {
    public static void main(String[] args) {

        int sayi = 10;

        // sayi variable'nin 2 katinin 5 fazlasi yapin

        sayi = 2*sayi+5;

        System.out.println(sayi);
        //2. yöntemle ypacak olursak
        sayi=10;
        sayi *=2;
        sayi +=5;

        System.out.println(sayi);

        sayi = 10 ;
        sayi *= 3;
        sayi/=3;
        System.out.println(sayi);

        int a =10;

        // a'nin degerini yeni olusturdugumuz b'ye atayip sonra a'nin degerini bir artirin

        // a ve b'yi yazdirin

        int b=a;

        a++;

        System.out.println("a:" + a + "b:" +b);

       a=10;

        a++;
        b=a;
        System.out.println("a:" + a + "b:" +b);


    }
}
