package practice_day04;

import java.util.Scanner;

public class soru {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen ay numarasini giriniz : ");
        int ay= scanner.nextInt();
        System.out.print("Lutfen yılı giriniz : ");
        int yil= scanner.nextInt();

        switch (ay){
            case 1:
                System.out.println("Ocak " + yil+"'da 30 gün vardir");
                break;
            case 2:
                System.out.println("Subat " + yil+"'da 30 gün vardir");
                break;
            case 3:
                System.out.println("Mart " + yil+"'da 30 gün vardir");
                break;
            case 4:
                System.out.println("Nisan " + yil+"'da 30 gün vardir");
                break;
            case 5:
                System.out.println("Mayıs " + yil+"'da 30 gün vardir");
                break;
            case 6:
                System.out.println("Haziran " + yil+"'da 30 gün vardir");
                break;
            case 7:
                System.out.println("Temmuz " + yil+"'da 30 gün vardir");
                break;
            case 8:
                System.out.println("Agustos " + yil+"'da 30 gün vardir");
                break;
            case 9:
                System.out.println("Eylul " + yil+"'da 30 gün vardir");
                break;
            case 10:
                System.out.println("Ekim " + yil+"'da 30 gün vardir");
                break;
            case 11:
                System.out.println("Kasim " + yil+"'da 30 gün vardir");
                break;
            case 12:
                System.out.println("Aralik " + yil+"'da 30 gün vardir");
                break;
            default:
                System.out.println("ay numarasini yanliş girdiniz . Tekrar deneyiniz");


        }


    }
}
