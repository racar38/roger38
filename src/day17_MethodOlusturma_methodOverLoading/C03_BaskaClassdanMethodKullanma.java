package day17_MethodOlusturma_methodOverLoading;

import day16_MethodOlusturma_Kullanma.C01_MethodOlusturma;
import day16_MethodOlusturma_Kullanma.C03_MethodOlusturma;

public class C03_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {

        C01_MethodOlusturma.altString("METHOD BUDUR...",7,8);  //B
        System.out.println(C01_AsalSayiBulma.asalSayiMi(59));  //true

        System.out.println(C03_MethodOlusturma.isimDuzenle("omer", "GOK")); // Omer Gok
        System.out.println(C02_TamBolenlerSayisiniBulma.tamBolenlerSayisi(12));  //6
    }
}
