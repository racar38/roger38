package Practiceday_extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ornek38 {
    /*
    Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve verilen bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın
Örnek:
Input : {3,2,5,4,1,6}
Output :
min: 1
max: 6
Ipucu: sort yöntemni kullanabilirsiniz.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Olusturulacak Aray'in uzunlugunu giriniz");
        int uzunluk = scanner.nextInt();

        int[] arr = new int[uzunluk];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Lutfen aray'in " + (i + 1) + " .nci elamanini giriniz :");
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

    }


}


