package practice_day07;

import java.util.Scanner;

public class ornek {

    public static void main(String[] args) {

        System.out.println("Lutfen notunuzu giriniz: ");
        Scanner scanner=new Scanner(System.in);
        int isim= scanner.nextInt();

        if (isim>90 && isim<101){
            System.out.println("NOT : A");

        } else if (isim>80 && isim<90) {
            System.out.println("NOT : B");

        } else if (isim<80) {
            System.out.println("NOT : C");
        }else {
            System.out.println("NOT: D");
        }
    }
}
