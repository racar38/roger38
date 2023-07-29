package day27_parametreliConstructor_constructorCall;

public class C02_HastaneRunner {
    public static void main(String[] args) {

        C01_Hastane personel1=new C01_Hastane();


        // CONSTRUCTOR ==> Yeni obje olusturup ve ona uyan degerlerin atamasini yapar...
        // C01_Hastane()==>> Constructor
        // CONSTRUCTOR method gibi cagirinca calisir.

        System.out.println(personel1.personelIsmi); // isim atanmadi
        System.out.println(personel1.personelTelefonu); // telefon atanmadi
        System.out.println(personel1.hastaneAdi); // Yildiz Hastanesi
        System.out.println(personel1.hastaneTelefonu); // 03122456754

        personel1.personelTelefonu="5552223333";
        personel1.personelIsmi="Berkay";


        C01_Hastane personel2=new C01_Hastane();

        System.out.println(personel2.personelIsmi); // isim atanmadi
        System.out.println(personel2.personelTelefonu); // telefon atanmadi




    }
}
