package Practiceday_extra;

import java.util.Scanner;

public class ornek17 {

    /*
                                   Soru 17-)
                Kullanıcıdan bir isim isteyelim.
                Bu isim 3 harfli olmalıdır.
                Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
                İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
                değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
                Ipucu:
                IF/Else - Ternary kullanabilirsiniz.
                Harfleri Char ile alıp karşılaştırabilirsiniz.
     */

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 3 harfli bir isim giriniz");
        String girilenIsim= scanner.nextLine();

        char ch1=girilenIsim.charAt(0);
        char ch2=girilenIsim.charAt(1);
        char ch3=girilenIsim.charAt(2);



        if (girilenIsim.length()!=3){
            System.out.println("Lutfen 3 harfli bir isim giriniz");
        }else{

            System.out.println(ch1 == ch2 || ch2 == ch3 || ch1 == ch3 ? "Dize yinelenen karakterlere sahip"
                    : "Dize benzersiz karakterlere sahip");
        }
    }
}
