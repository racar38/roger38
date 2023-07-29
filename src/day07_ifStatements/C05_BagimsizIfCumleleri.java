package day07_ifStatements;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class C05_BagimsizIfCumleleri {
    public static void main(String[] args) {

        // soru:5 Kullacidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise "Eskenar ucgen " yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        /*
            Java'da 3 'lu karsilastirma OLMAZ
            İKİLİ karsilastirmalar yapip
            && veya || operatorleri ile birlestirmeliyiz

         */
        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar2>0)

            System.out.println("Eskenar ucgen");
    }
}
