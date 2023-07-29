package day21_arrays;

public class C07_EnUzunEnKisaKelimeYazdir {

    public static void main(String[] args) {

        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun

        String[] isimler={"Resul","Omer","Mehmet","Ertugrul"};

        enUzunEnKisaKelime(isimler);



    }

    public static void enUzunEnKisaKelime(String[] isimler){

        String EnUzunKelime=isimler[0]; // sadece baslangic degeri olmasi icin atandi
        String EnKisaKelime=isimler[0]; // "

        for (int i = 0; i <isimler.length ; i++) {

            if (isimler[i].length()>EnUzunKelime.length()){
                EnUzunKelime=isimler[i];
            }
            if (isimler[i].length()<EnKisaKelime.length()){
                EnKisaKelime=isimler[i];

            }
        }
        System.out.println("En uzun isim : " + EnUzunKelime);
        System.out.println("En  kisa isim : " + EnKisaKelime);
    }
}

//   aynı uzunlukta farkli kelimeler  olsaydi java >= --  <= olmadigi surece ilk metni alacaktir...
