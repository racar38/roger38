package day08_IfElseIfStatements;

import java.util.Scanner;

public class C05_VucutKitleEndeksi {
    public static void main(String[] args) {

        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        //(kilo*10000 / (boy *boy)) vucut kitle endeksi
        // 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen kilonuzu kg olarak giriniz");

        double kilo = scanner.nextDouble();

        System.out.println("Lutfen boyunuzu cm olarak giriniz");

        double boy = scanner.nextDouble();

        double vke = kilo*10000/ (boy*boy);

        if (vke>=30){
            System.out.println("vke : "+ vke + "Maalesef obezsiniz");

        } else if (vke>=25) {
            System.out.println("vke : "+ vke + "Maalesef kilolusunuz");

        } else if (vke>=20) {
            System.out.println("vke : "+ vke + " Normal");

        } else {
            System.out.println("vke : "+ vke + "Maalesef zayifsiniz");

        }

    }
}
