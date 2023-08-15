package proje_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class CMenu {

    Scanner scan = new Scanner(System.in);
    ArrayList<AUser> kullanicilar = new ArrayList<>();
    BRegistration registration = new BRegistration();

    void menu() {
        /*
        -kayıt alma
        -şanslı kullanıcı
        -kullanıcıları listeleme
        -çıkış  // System.exit(status 0); olarak da yapılabilir...
         */
        boolean cikis = true;
        do {
            System.out.print("1. Kayıt İşlemi\n" +
                    "2. Kişi Listele\n" +
                    "3. Şanslı Kişiler\n" +
                    "4. Çıkış\n" +
                    "SEÇİMİNİZ: ");
            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    kullanicilar = BRegistration.register();
                    break;
                case 2:
                    registration.kullaniciListesi(kullanicilar);
                    break;
                case 3:
                    BRegistration.printHappyUsers(kullanicilar);
                    break;
                case 4:
                    cikis = false;
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız....");
                    break;
            }

        } while (cikis);
    }
}


