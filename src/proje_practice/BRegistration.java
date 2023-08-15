package proje_practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class BRegistration {
    /*
   2- Registration(Kayıt) isminde bir class oluşturun ve register()(kayıtAl()) isminde bir metod
   ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i
   return edin.

   3- Registration(Kayıt) classı na aynı zamanda kendine verilen
   ArrayListteki userlardan(kullanıcı) her dakikanın ilk 10  saniyesinde kaydolanları
   yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod daha ekleyiniz.
   */
    static ArrayList<AUser> kullanicilar = new ArrayList<>();// bu array listin içinde user tipinde veriler tutulacak
    static Scanner scan = new Scanner(System.in);

    static ArrayList<AUser> register() {
        System.out.print("İsminizi giriniz: ");
        String name = scan.nextLine();
        LocalDateTime time = LocalDateTime.now();
        AUser kullanici = new AUser(name, time);// p'li cons. kullanarak user class ından obje oluşturduk
        kullanicilar.add(kullanici);
        return kullanicilar;
    }

    static void printHappyUsers(ArrayList<AUser> list) {
        for (AUser each : list) {
            /*
            Registration(Kayıt) classı na aynı zamanda kendine verilen
     ArrayListteki userlardan(kullanıcı) her dakikanın ilk 10  saniyesinde kaydolanları
     yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod daha ekleyiniz.
             */
            if (each.registerDate.getSecond() <= 10) {
                System.out.println(each.name + " hadi iyisin 5 kilo balı kaptın....");
            } else {
                System.out.println(each.name + " bu sefer olmadı. Bi dahaki sefere....");
            }
        }
    }

    void kullaniciListesi(ArrayList<AUser> list) {
        for (AUser each:list) {
            System.out.println("İsim: "+each.name+"  Kayıt zamanı: "+each.registerDate);
        }
    }
}
