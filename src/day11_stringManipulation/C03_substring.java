package day11_stringManipulation;

public class C03_substring {
    public static void main(String[] args) {

        String str="Java Candir";

        /*
          substring() bize verilen bir string'in istenen parcasini alma imkani tanır
            2- turlu kullanimi vardir:

          1- baslangic index'ini verirseniz , o indexten sona kadar olan kismi verir
          2- baslangic ve bitis indexlerini verirseniz
             baslangic index'inden (dahil) baslar
             bitis index'ine kadar(haric) aradaki karakterleri yazdirir

         */

        System.out.println(str.substring(3));  // a Candir

        //System.out.println(str.substring(15)); // StringIndexOutOfBoundsException

        System.out.println(str.substring(11)); // boşluk yani hiclik verir

        System.out.println(str.substring(3,6)); // a C

        System.out.println(str.substring(5,10)); // Candi

        System.out.println(str.substring(1,2)); // a

        System.out.println(str.substring(6,7)); // a

        // bu yazim bize istenen index'deki tek bir elementi verir
        // charAt'e benzer ama arti bir ozelligi var
        // substring bize string verdigi icin manipulation yapmaya devam edebiliriz

        // 6.index'deki harfi buyuk harf olarak yazdirin
        System.out.println(str.substring(6,7).toUpperCase());

        System.out.println(str.substring(3,3)); // hiçlik bos bir satir

       // System.out.println(str.substring(8,5)); // hata geri vites yoktur :)

        //son 3 harfi yazdirin
        System.out.println(str.substring(str.length()-3)); // dir

        String str1 = "Java";
        String str2= " ";
        String str3= "Candir";
        System.out.println(str1+str2+str3); // Java Candir

        System.out.println(str1.concat(str2).concat(str3)); // Java Candir
    }
}
