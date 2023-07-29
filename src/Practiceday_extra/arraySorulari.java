package Practiceday_extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraySorulari {

    /*
    Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
    elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.



    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 3, 2, 5, 1, 5, 3, 7};

        tekrarsizListe(arr);
    }

    public static int[] tekrarsizListe(int[] arr) {

        List<Integer> tekrarsizList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizList.contains(arr[i])) {
                tekrarsizList.add(arr[i]);
            }
        }
        System.out.println(tekrarsizList);
        return arr;
    }

     */

    public static void main(String[] args) {

        /*
        - Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
         liste olarak dondurecek bir method olusturun.
         */

        ArrayList<String> isimler = isimleriAl();
        System.out.println("Girilen isimler:");
        for (String isim : isimler) {
            System.out.println(isim);
        }
    }

    public static ArrayList<String> isimleriAl() {
        ArrayList<String> isimler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("İsimleri girmeye başlayın. 'Q' tuşuna basarak işlemi tamamlayın.");

        while (true) {
            String isim = scanner.nextLine();
            if (isim.equalsIgnoreCase("Q")) {
                break;
            }
            isimler.add(isim);
        }

        scanner.close();
        return isimler;
    }
    }

