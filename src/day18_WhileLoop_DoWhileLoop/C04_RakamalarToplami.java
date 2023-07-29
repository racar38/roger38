package day18_WhileLoop_DoWhileLoop;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C04_RakamalarToplami {

    public static void main(String[] args) {

        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen rakamlar toplamini bulmak istediginiz sayiyi yaziniz");
        int girilenSayi= scanner.nextInt();

        int sayi=girilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while(sayi>0){

            birlerBasamagi=sayi%10;                       // girilen sayi üzerinden islemi yapsaydik sonuca
                                                          //girilensayi yi yazdiramazdik 0 a kadar indirdik cunku
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

        }
        System.out.println("girilen " + girilenSayi + "'nin rakamlar toplami : " + rakamlarToplami);
    }
}
