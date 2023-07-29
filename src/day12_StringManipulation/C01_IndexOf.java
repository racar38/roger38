package day12_StringManipulation;

public class C01_IndexOf {
    public static void main(String[] args) {

        String str = "Ali topu at, topu at ali";

        // İlk topu kelimesinin index i kaçtır

        System.out.println(str.indexOf("top")); // 4

        //ikinci top metin parcasinin indexini yazdirin

        System.out.println(str.indexOf("top", 5)); // 4 . top kelimesi var bir sonraki icin 5 index aratilir

        System.out.println(str.indexOf("top", str.indexOf("top") + 1)); // her iki yollada yapilabilir

        // at kelimesinin 2 kere kullanilip kullanilmadigini metne bakmadan bulun ?

        int ilkIndex = str.indexOf("at");                           // ya -1 veya dogal sayi olur

        if (ilkIndex == -1) {                                       // Hic kullanilmamis
            System.out.println("2 kere kullanilmamis");
            } else {                                                 // en az 1 kere kullanilmis

            int ikinciIndex = str.indexOf("at",ilkIndex+1);
                                                             // -1 olabilir veya 2. defa kullanilmissa dogal sayi olur
                if (ikinciIndex == -1) { // sadece bir kere kullanilmis , 2.kullanim yok
                    System.out.println("2 kere kullanilmis");
                } else {
                    System.out.println("2 defa veya daha fazla kullanilmis");
                }

            }
        }
    }


