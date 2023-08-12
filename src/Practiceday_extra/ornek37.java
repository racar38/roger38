package Practiceday_extra;

import java.util.ArrayList;
import java.util.Scanner;

public class ornek37 {
    /*
    Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
---->>>
public static int[] eliminateDuplicates(int[] list)
ÖRNEK:
On sayi giriniz:
1 2 3 2 1 6 3 4 5 2
ÇIKTI:
Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen 10 adet tamsayi giriniz ");
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Lutfen Array'in " + (i + 1) + ".nci" + "elementini giriniz :");
            arr[i] = scanner.nextInt();

        }
        tekrarsiz(arr);


    }

    public static void tekrarsiz(int[] arr) {

        ArrayList<Integer> tekrarsizliste = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizliste.contains(arr[i])) {

                tekrarsizliste.add(arr[i]);

            }


        }

        System.out.println(tekrarsizliste);
    }
}
