package practice_day02;

import java.util.Scanner;

public class P01_Scanner {

    public static void main(String[] args) {

         /*
              1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
                sisteme kaydedildiğini aşağıdaki formatta yazdırın.
                             *****       KAYIT BAŞARILI      *****
Adınız: Tarık
Soyadınız: Yiğit
Yaşınız:42
Mail Adresiniz:tarik@yigit.com
Şifreniz: A2e365
şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyadinizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Lütfen yasinizi giriniz");
        int yas = scan.nextInt();
        scan.nextLine();
        System.out.println("Lütfen mail adresinizi giriniz");
        String email=scan.nextLine();
        System.out.println("Lütfen sifrenizi giriniz");
        String sifre=scan.nextLine();
        System.out.println("*****       KAYIT BAŞARILI      *****");
        //scan.nextLine();

        System.out.println("Adınız: " + isim);
        System.out.println("Soyadınız: " + soyisim);
        System.out.println("Yaşınız: " + yas);
        System.out.println("Mail Adresiniz: " + email);
        System.out.println("Şifreniz: " + sifre);
        System.out.println("şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");


        scan.close();
    }
}
