package Practiceday_extra;

import java.util.Scanner;

public class ucgeninAlani {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ucgenin kenarını gir");
        double kenar = scan.nextDouble();
        System.out.println("lutfen o kenara ait yuksekligi gir");
        double yukseklik = scan.nextDouble();

        double alan = kenar*yukseklik/2;

        System.out.println("Alan:  "  + alan);
    }
}
