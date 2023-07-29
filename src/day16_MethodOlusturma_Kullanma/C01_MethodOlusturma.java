package day16_MethodOlusturma_Kullanma;

public class C01_MethodOlusturma {

        /*
        SORU 1-) Kullanicidan input olarak verilen bir String,
         baslangic ve bitis indexlerine gore
         baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
         bir method olusturun.
         kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
         mesaji verin
         kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
         yazdirin.
         */

    public static void main(String[] args) {

    altString("Java guzeldir",3,7);          //a gu
    altString("Biraz sabir lutfen",5,4);     // Baslangic index'i bitis index'inden buyuk olamaz
        altString("Bu da mi gol degil?",11,33);      // Verilen index sinirlarin disinda

        String str1="Aramiz bozulmasin";
        altString(str1,5,10);  // z boz

        String str="Java guzeldir";

        int basIndex=3;

        int bitIndex=7;
    }                                                                                // main method sonu

    public static void altString( String metin,int basIndex,int bitIndex ) {
        if (basIndex>bitIndex){
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        } else if (basIndex>=metin.length() || bitIndex>=metin.length() ) {
            System.out.println("Verilen index sinirlarin disinda");
        }else{
            for (int i = basIndex; i < bitIndex; i++) {
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println();                                                         // BİR ALT SATIRA YAZMASI ICIN
    }
}                                                                                      //class'in sonu