package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        //kullacidan notunu isteyin
        //50 ve  üzeri ise sinifi gectin
        //degilse maalesef kaldin yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double girilenNot = scanner.nextDouble();

        if ( girilenNot>= 50) System.out.println("sinifi gectin");
        if (girilenNot<50) System.out.println("Maalesef kaldin");

        /*
            Eger bir sart icin sadece 2 durum soz konusu ise  iki durumu ayri ayri kontrol etmek yerine
            tek bir kontrol ile de yapabiliriz

            Bagimsiz if cumlelerinden farkli olarak if else cumlelerinde ya if body'si ya else body'si calisir

            IKISININ BIRDEN calismasi mumkun olmadigi gibi,
            IKISININ DE CALISMAMASI mumkun degildir.
         */

        if (girilenNot>=50){
            System.out.println("sinifi gectin");
        } else {
            System.out.println("maalesef kaldin");
        }
    }
}
