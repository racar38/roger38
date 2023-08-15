package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ornekCalisma {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOlustur()));
    }

    public static int[] arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.print(" LÜtfen oluşturulacak array'in boyutunu giriniz: ");
        int length= scan.nextInt();
        int []array=new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Array için tamsayı olan bir eleman giriniz: ");
            array[i]= scan.nextInt();
        }
        return array;
    }
}

