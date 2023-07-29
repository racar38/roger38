package practice_day05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class dahaBasitForLoop {

     /*
         Kullanicidan 150'den küçük pozitif bir sayi alin, 1’den baslayarak tum
        tamsayilari yazdirin, sira
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine WISE
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine QUARTER
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine WISE QUARTER
        yazdirin
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 150 den kucuk bir pozitif sayi giriniz");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {

            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(" WISE QUARTER");

            } else if (i % 3 == 0) {
                System.out.print(" WISE");

            } else if (i % 5 == 0) {
                System.out.print(" QUARTER");

            } else {
                System.out.print(i + " ");
            }
        }
    }
}
