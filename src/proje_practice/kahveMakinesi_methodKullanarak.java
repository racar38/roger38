package proje_practice;

import java.util.Scanner;

public class kahveMakinesi_methodKullanarak {

    public static void main(String[] args) {

        kahveSiparisiAl();
    }

    public static void kahveSiparisiAl() {

        Scanner scanner = new Scanner(System.in);

        // Kahve seçenekleri
        String[] kahveler = {"Türk kahvesi", "Filtre Kahve", "Espresso"};

        // Hangi Kahveyi istediğini sor
        System.out.println("Hangi Kahveyi İstersiniz?");
        for (int i = 0; i < kahveler.length; i++) {
            System.out.println((i + 1) + "." + kahveler[i]);
        }
        int secim = scanner.nextInt();
        scanner.nextLine(); //  atlama problemini ortadan kaldirmak için

        if (secim < 1 || secim > kahveler.length) {
            System.out.println("Geçersiz seçim. Lütfen geçerli bir seçim yapınız.");
            scanner.close();
            return;
        }

        String kahveSecimi = kahveler[secim - 1];

        // Süt eklensin mi?
        System.out.println("Süt eklemek istiyor musunuz? (Evet veya Hayır olarak cevaplayınız)");
        String sutCevap = scanner.nextLine();

        // Şeker eklensin mi?
        System.out.println("Şeker ister misiniz? (Evet veya Hayır olarak cevaplayınız)");
        String sekerCevap = scanner.nextLine();

        // Kahve boyutu
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");
        String boyut = scanner.nextLine();

        // Siparişin son hali
        System.out.println(kahveSecimi + " " + boyut + " hazırdır. Afiyet olsun!!!");

        scanner.close();

    }


}

