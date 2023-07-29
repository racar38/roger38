package day07_ifStatements;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {

      /*
        bagimsiz if cümleleri ismindende anlasilacagi gibikodun kalani ile ilgilenmez

            sadece boolean sarta odaklanir
            sartin sonucu true ise if body'si calisir
         boolean satin sonucu false ise
            if body'si devreye girmez

            YANIII
            birden fazla bagimsiz if cumlesi olan bir kod calistiginda
            kac tane if body'sinin calisacagi verilen degerlere baglidir

            tum if body'leri calisabilir
            bazilaricalisabilir
            ya da hic bir if body'swi calismayabilir

       */

        int a = 20;
        int b = 30;

        if (a > 0) {
            System.out.println("a sayisi pozitif");

        }

        if (a + b > 100) {
            System.out.println("sayilarin toplami 100'den buyuk"); //    FALSE calismaz
        }

        if (b % 3 == 0) {
            System.out.println("b 3 ile tam bolunen bir sayidir");
        }

        if (b < 100) {
            System.out.println("b 100'den kucuk bir sayidir");
        }
    }
}
