package day10_switchCase_StringManipulations;

public class C03_StringManipulations {
    public static void main(String[] args) {


        /*
          String manipulation,
          verilen bir String uzerinde HAZIR method'lar kullanarak
          -degisiklik yapmak
          -veya  verilen string uzerindeki bir bilgiyi
          almak icin yaptigimiz tum islemlerdir

          String uzerinde yapilan manipulation islemleri
          string'i kalici olarak degistirmez ( atama yapilmadigi surece)

          Eger yapilan islem sonucundaki yeni halin kalici olmasini istersek
          ATAMA yapmaliyiz
         */


        String str = "Java Candir";


        // soru :str'in ilk harfini yazdirin

        System.out.println(str.charAt(0)); // J

        //  soru : str'in tum harfleri buyuk olacak sekilde yazdirin

        System.out.println(str.toUpperCase());  // JAVA CANDIR

        System.out.println(str); // Java Candir

        //  soru: str'i tamamen kucuk harflerden olusan bir metne cevirin

        str = str.toLowerCase();

        System.out.println(str);
    }
}
