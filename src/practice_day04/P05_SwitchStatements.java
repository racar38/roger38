package practice_day04;

import java.util.Scanner;

public class P05_SwitchStatements {

    public static void main(String[] args) {

        // Kullanicidan o gunun hangi gun oldugunu girmesini isteyip
        // haftanin kacinci gunu oldugunu yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bugun gunlerden hangi gun");
        String gun=scanner.nextLine();
        gun=gun.toLowerCase();
        switch (gun){

            case "pazartesi" :  // switch case durumunda eger case sayi ise direk yazilircase metin ise" " arasinda yazilir
                System.out.println("Haftanin 1. gunudur.");
                break;
            case "sali" :
                System.out.println("Haftanin 2. gunudur.");
                break;
            case "carsamba" :
                System.out.println("Haftanin 3. gunudur.");
                break;
            case "persembe" :
                System.out.println("Haftanin 4. gunudur.");
                break;
            case "cuma" :
                System.out.println("Haftanin 5. gunudur.");
                break;
            case "cumartesi" :
                System.out.println("Haftanin 6. gunudur.");
                break;
            case "pazar" :
                System.out.println("Haftanin 7. gunudur.");
                break;
                default:
                System.out.println("yanlis gun girdiniz");
        }
    }
}
