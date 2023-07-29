package day19_scope;

public class C02_ClassLevelVariablelar {


    static boolean bls;
    boolean bli;
    static String strs="Java";
    String stri;
    static int sayis;
    int sayii=23;
    static char  chrs='a';
    char chri;

    public static void main(String[] args) {

        System.out.println(bls); // false
        System.out.println(strs); // Java
        System.out.println(sayis); // 0
        System.out.println(chrs); // a

        C02_ClassLevelVariablelar obj=new C02_ClassLevelVariablelar();
        // instance variable'lara ulasmak icin obje olusturmak gerekir'  obj olarak atama yaptik
        System.out.println(obj.bli);   // false
        System.out.println(obj.stri);   // null           // obj araciligi ile ulasabiliriz
        System.out.println(obj.sayii);   // 23
        System.out.println(obj.chri);    // '' hiclik

    }

    /*
        class level kurallar
        1- class level variable'lara deger atanmasada
            hem olusturulabilir , hem de kullanilabilir
            deger atamasi yapmadiysak onlara default olan degerleri atar

            boolean==>> false
            sayisal variable'lar icin ==>0
            nın-primitive variable'lar icin ==>null
            char icin ==> '' char olarak hiclik

         2- instance variable'lara static method'lar icinden direk ULASILAMAZ
           EGER static method icinde instance variable kullanmak gerekirse
           o class'dan bir obje olusturup
           o obje uzerinden instance variable'lara ulasabiliriz

         3-Baska class'daki class level variable'lara ulasmak istersek
         static variable'lar icin  classIsmi.StaticVariableIsmi
         yazarak ulasabilirsiniz

         instance variable'lara ulasmak icin ise;
          variable'larin oldugu class'dan obje olusturmaliyiz

         eger static bir variable'a obje uzerinden ulasmak isterseniz
         java otomatik olarak getirmez
         ama elle yazarsaniz kabullenir ( sari isaretler o zaten static neden instance muamelesi yapiosun der:)

         intellij static variable'a instance gibi obje üzerinden ulasirsaniz
         kodu sariya boyayarak sizi uyarir.
     */
}
