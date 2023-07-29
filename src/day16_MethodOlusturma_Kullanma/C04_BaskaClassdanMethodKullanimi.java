package day16_MethodOlusturma_Kullanma;

public class C04_BaskaClassdanMethodKullanimi {
    public static void main(String[] args) {

        C01_MethodOlusturma.altString("Method", 1, 3);  //et

        System.out.println(C03_MethodOlusturma.isimDuzenle("Bugra", "can"));  //Bugra Can

        String isimDuzenli = C03_MethodOlusturma.isimDuzenle("MEHMET", "KEMAL");

        // duzenlenmis ismin uzunlugunu yazdirin

        System.out.println(isimDuzenli.length());   // 12

        /*
           Void olan method'da sonucu KAYDEDEMEYIZ,sadece yazdiririz

           bize deger DÖNDÜREN method'da ise sonucu
           istersek direk yazdirir , istersek de kaydederiz
         */
    }
}
