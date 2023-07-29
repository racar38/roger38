package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // soru : kullanicidan pozitif bir tamsayi alin
        // sayinin tek mi çift mi olduğunu yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsaayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi%2==0){
            System.out.println("çift sayi");
        }else{
            System.out.println("tek sayi");
        }



        /*
               If else ile yapabilecegimiz basit islemleri
            daha kisa olarak yazabilmek icin ternary kullanilir...
         */


        System.out.println(sayi%2==0 ? "Cıft sayi" : "tek sayi");


    }
}
