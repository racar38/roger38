package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {

        // SORU : Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo= scan.nextInt();

       switch (gunNo) {

           case 1 :
               System.out.println("Hafta ici");
               break;
           case 2 :
               System.out.println("Hafta ici");
               break;
           case 3 :
               System.out.println("Hafta ici");
               break;
           case 4 :
               System.out.println("Hafta ici");
               break;
           case 5 :
               System.out.println("Hafta ici");
               break;
           case 6 :
               System.out.println("Hafta ici");
               break;
           case 7 :
               System.out.println("Hafta ici");
               break;
           default:
               System.out.println("Gun numarasi 1-7 arasinda olmalidir");
       }

       // yukarida detayli olarak yazilan kodu daha kisa olarak şu sekilde olusturabiliriz

        switch (gunNo){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("haftaici");
                break;
            case 6 :
            case 7 :
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("Gun numarasi 1-7 arasinda olmalidir");
        }
    }
}
