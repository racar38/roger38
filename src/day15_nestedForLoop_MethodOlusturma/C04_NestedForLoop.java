package day15_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C04_NestedForLoop {

    public static void main(String[] args) {

        /*
        kullanicidan satir sayisi olarak bir rakam alin ve asagidaki gibi cizdirin
        *
        *  *
        *  *  *
        *  *  *  *
        *  *  *  *  *
          */

        Scanner scanner=new Scanner(System.in);
        System.out.println("olusturulacak seklin satır sayisini girin");
        int satir= scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
