package day19_scope;

public class C01_Scope {

    static int classLevelStatic=12;
    String strClassLevelStaticOlmayan="Java Guzeldir";


    public static void main(String[] args) {

        int sayiMain=20;

        for (int i = 0; i <10 ; i++) {
            int sayiForLoop=5;
        }
    }

    public static void staticMethod(){

        String strStatic="Java Candir";
    }
    public static void staticOlmayanMethod(){

        boolean staticOlmayanMethod=true;
    }

    /*
        Scope temelde 2 ye ayrilir.
           1- LOCAL VARIABLE'LAR
               A- scope'lari icinde olusturduklari kod blogudur
               bir method'da olusturulan variable,baska bir method'da kullanilamaz
               B- loop scope'u
                  bir loop icerisinde olusturulan variable
                  sadece o loop icerisinde olusturulabilir
                  olusturuldugu method'da loop'un disinda da KULLANILAMAZ

              NOT: local variable'lar deger vermeden olusturulabilir
                   ama deger atanmadan KULLANILAMAAZ

              2- CLASS LEVEL VARIABLE'LAR
                 class level variablee'lar method'larin ve kod bloklarinin disinda olusturulur
                 ve scope'lari TUM CLASS'dir.

                 Class level variable'larin scope'u tum class olsada
                 static keyword de variable'larin kullanimina etki eder

                 hastane ismi , hastane adresi, bashekim adi gibi variable'lar
                 herkes icin ortak olmalidir.
                 bu tur variable'lar static olarak isaretlenir

                 personel ismi,personel adresi,personel telefonu gibi variable'lar ise
                 tum personel icin tanimli olmakla birlikte
                 bu variable'lardaki degisim herkesi ETKİLEMEZZZ
                 sadece o personeli etkiler
                 bu tur variable'lari ise static yapmayiz
                 static olmayan class level'daki variable'lara INSTANCE variable'lar denir...

                 C- class level static variable'lar
                 bu variable'lar static klubune uye olduklari icin
                 her yere gidebilirler
                 her method'dan kullanılablirler

                 D- class level intance variable'lar
                 variable static olmayinca ustunlugu olmaz
                 bu durumda secici olan method olur

                 static method'lar instance variable'larin girmesine izin vermez
                 ama static olmayan method'lar,
                 static olmayan(instance) variable'lari kabul eder


     */
}
