package day10_switchCase_StringManipulations;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class extraOrnek {
    public static void main(String[] args) {

        // - Kullanicidan ay numarasini alip mevsimi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ay numarasini giriniz");
        int ayNo = scan.nextInt();

        switch (ayNo) {

            case 12:
            case 1:
            case 2:
                System.out.println("KIŞ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Ay Numarasi 1-12 arasinda olmalidir");
        }
    }
}
