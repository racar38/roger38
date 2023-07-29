package practice_day05;

import java.util.Scanner;

public class EkokEbob {
    public static void main(String[] args) {

        //kullanicidan 2 tamsayi alin ve EBOB(en kucuk ortak bolen)
        //EKOK(En Kucuk Ortak Bolen) degerlerini bulun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif iki tamsayi giriniz");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int flag = 0;
        System.out.println("Girdiginiz sayilar sirasiyla : " + num1 + "-" + num2);
        //Once EBOB hesaplamasi yapalim
        //ilk olarak kucuk sayiyi ebob degiskenine atiyorum
        // 30 ve 40 degerleri icin
        int limitEbob = 0;
        if (num1 < num2) {
            limitEbob = num1;

        } else {
            limitEbob = num2;
        }

        for (int i = limitEbob; i >= 2; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("Bu sayilarin EBOB degeri : " + i);
                flag++;
                break;
            }

        }

        if (flag == 0) {
            System.out.println("Bu iki sayinin ortak boleni yoktur");
        }

        // Girilen sayilarin ekok degerini bulalim

        flag = 0;

        for (int i = 1; i < 100000; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("Girdiginiz sayilarin EKOK degeri : " + i);
                flag++;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Girdiginiz sayilarin 100000 'den kucuk bir EKOK degeri yoktur ");
        }

    }
}
