package day44_maps;

import java.util.Map;

public class C05_KeyIleValueyaUlasma {

    public static void main(String[] args) {

        // numarasi verilen ogrencinin isim,soyisim,sinif ve subesini yazdirin

        Map<Integer,String> ogrenciMap=MethodDeposu.ogrenciMapOlustur();
        // öğrenci bilgilerini tek tek girmemek için hazır olusturduğumuz
        //MethodDeposundan alıyoruz....

        System.out.println(ogrenciMap.get(102));

        MethodDeposu.numaraIleOgrenciBilgisiyazdirma(ogrenciMap,103);


    }
}
