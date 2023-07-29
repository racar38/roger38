package day12_StringManipulation;

public class C02_LastIndexOf {

    public static void main(String[] args) {

        String str = "Javayi ogrenecegiz, baska yolu yok";

        // a harfinin ilk kullanim indexini yazdirin

        System.out.println(str.indexOf('a')); // 1

        // a harfinin son kullaniminin indexini yazdirin

        System.out.println(str.lastIndexOf('a')); // 24

        // J harfinin ilk indexini yazdirin
        System.out.println(str.indexOf("J"));  // 0

        // J harfinin son kullaniminin indexini yazdirin

        System.out.println(str.lastIndexOf("J")); // 0 SONDAN ARAMAYA BASLAR

        // Metne bakmadan e harfinin 2 kere veya daha fazla kullanilip kullanilmadigini yazdirin

        int ilkIndex = str.indexOf("e");
        int sonIndex = str.lastIndexOf("e");

        if (ilkIndex == -1) {     // hiç kullanilmamistir
            System.out.println("Hic e kullanilmamis");

        } else if (ilkIndex == sonIndex) {
            System.out.println("Sadece 1 e kullanilmis");
        } else {
            System.out.println("e harfi 2 kere veya daha fazla kullanilmis");
        }


        // o harfinin son indexini bulunuz
        System.out.println(str.lastIndexOf("o"));  //32

        // o harfinin son kullanimindan bir önceki kullaniminin indexini bulun

        System.out.println(str.lastIndexOf("o",31)); // 27  geriden aramada -1 düş bastan aramada +1 ekle

    }
}