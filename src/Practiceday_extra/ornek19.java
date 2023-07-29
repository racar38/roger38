package Practiceday_extra;

import java.util.Scanner;

public class ornek19 {

    /*
               Soru 19-)  Method Sorusu
        Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
        ipucu:
                    Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
                    Burçların Tarihleri ve Özellikleri

            Koç Burcu-21 Mart- 20 Nisan
            Boğa Burcu-21 Nisan – 20 Mayıs
            İkizler Burcu  : 21 Mayıs – 21 Haziran
            Yengeç Burcu :22 Haziran – 22 Temmuz
            Aslan Burcu :23 Temmuz – 23 Ağustos
            Başak Burcu : 24 Ağustos – 23 Eylül
            Terazi Burcu : 24 Eylül – 23 Ekim
            Akrep Burcu : 24 Ekim – 22 Kasım
            Yay Burcu : 23 Kasım – 21 Aralık
            Oğlak Burcu : 22 Aralık – 20 Ocak
            Kova Burcu : 21 Ocak – 19 Şubat
            Balık Burcu : 20 Şubat – 20 Mart

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dogum tarihinizdeki ay numarasini giriniz : ");
        int ay =scanner.nextInt();
        System.out.println();
        System.out.print("Doğum tarihinizdeki gun numaranızı giriniz : ");
        int gun = scanner.nextInt();

        String burc=burcHesabi(ay,gun);
        System.out.println("Burcunuz : " + burc);
        burcHesabi(ay,gun);

    }

    public static String burcHesabi(int ay,int gun){

        String burc="";

        switch (ay){

            case 1:
                if (gun>=21){
                    burc="kova";
                }else{
                    burc="oğlak";
                }
                break;
            case 2:
                if (gun>=20){
                    burc="balık";
                }else{
                    burc="kova";
                }
                break;
            case 3:
                if (gun>=21){
                    burc="koç";
                }else{
                    burc="balık";
                }
                break;
            case 4:
                if (gun>=21){
                    burc="boğa";
                }else{
                    burc="koç";
                }
                break;
            case 5:
                if (gun>=22){
                    burc="kova";
                }else{
                    burc="oğlak";
                }
                break;
            case 6:
                if (gun>=23){
                    burc="yengeç";
                }else{
                    burc="ikizler";
                }
                break;
            case 7:
                if (gun>=23){
                    burc="aslan";
                }else{
                    burc="yengeç";
                }
                break;
            case 8:
                if (gun>=23){
                    burc="başak";
                }else{
                    burc="aslan";
                }
                break;
            case 9:
                if (gun>=23){
                    burc="terazi";
                }else{
                    burc="başak";
                }
                break;
            case 10:
                if (gun>=23){
                    burc="akrep";
                }else{
                    burc="terazi";
                }
                break;
            case 11:
                if (gun>=22){
                    burc="yay";
                }else{
                    burc="akrep";
                }
                break;
            case 12:
                if (gun>=22){
                    burc="oğlak";
                }else{
                    burc="yay";
                }
                break;
            default:
                burc="geçersiz ay numarasi girisi yaptiniz";
        }

        return burc;
    }
}
