package day07_ifStatements;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {


        // Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin

       Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen yasinizi giriniz");

        int girilenYas = scanner.nextInt();

        int b = 65-girilenYas;

        if (girilenYas>=65){
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println( "emekli olmak icin calisman gereken yil sayisi :" + b );
    }
}
}