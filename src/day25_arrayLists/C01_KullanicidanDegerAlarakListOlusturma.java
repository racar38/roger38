package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullanicidanDegerAlarakListOlusturma {

    public static void main(String[] args) {


        //Soru 2- Kullanicidan istedigi kadar isim alip,
        //        Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
        //        bir method olusturun.

        System.out.println(ListOlustur());
    }

    public static List<String> ListOlustur() {
        Scanner scanner;
        String girilenIsım;
        List<String> isimList = new ArrayList<>();

        do {
            scanner = new Scanner(System.in);
            System.out.println("Listeye eklemek icin isim giriniz\nBitirmek icin Q ya basiniz");
            girilenIsım = scanner.nextLine();

            if (!girilenIsım.equalsIgnoreCase("Q")) {
                isimList.add(girilenIsım);

            }


        } while (!girilenIsım.equalsIgnoreCase("Q"));
        return isimList;

    }


}

