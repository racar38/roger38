package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C01_SwitchStatements {

    public static void main(String[] args) {

        // soru : - Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //          ve girilen harfin karsiligini yazdirin.
        //          I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scan=new Scanner(System.in);
        System.out.println( "Lutfen anlamini ogrenmek istediginiz harfi giriniz");

        char harf = scan.next().toUpperCase().charAt(0);

        switch (harf){

            case 'I' :
                System.out.println("International");
                break;
            case 'S' :
                System.out.println("Software");
                break;
            case 'T' :
                System.out.println("Testing");
                break;
            case 'Q' :
                System.out.println(" Qualifications");
            case 'B' :
                System.out.println("Board");
                break;
            default:
                System.out.println("Yazdiginiz harf ISTQB 'de yok");
        }

    }

}
