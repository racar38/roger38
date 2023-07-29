package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //Isminiz : John
        //Soyisminiz : Doe
        //Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String girilenIsim = scanner.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String girilenSoyisim = scanner.nextLine();

        System.out.println("Lütfen yasinizi giriniz");
        int girilenYas = scanner.nextInt();

        // sout icerisindeki bir String'in yazdirilmasina
        // alt satirdan devam edilmesini isterseniz
        // String'in alt satira gecmesini istediginiz kisminda \n yazin

       /*
        System.out.println("Isminiz :" + girilenIsim);
        System.out.println("Soyisminiz : " + girilenSoyisim);               bu şekilde yazilabilir..tek bir
        System.out.println("Yasiniz : " + girilenYas);                        satirda yazmak için
        System.out.println("Kaydiniz basariyla tamamlanmistir.");

        */

        System.out.println("Isminiz : "+ girilenIsim +
                "\nSoyisminiz : " + girilenSoyisim +
                "\nYasiniz : " + girilenYas +
                "\nKaydiniz basariyla tamamlanmistir.");
    }
}
