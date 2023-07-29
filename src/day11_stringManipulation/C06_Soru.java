package day11_stringManipulation;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {

        // SORU : kullanicidan bir mail alin
        //- mail @ icermiyorsa "gecersiz mail"
        //- mail @gmail.com icermiyorsa, "mail gmail olmali"
        //- mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");

        // Eger testlerin kademeli olarak yapılmasini istiyorsak if-else-if kullanılır...
        String email = scanner.next();

        if (!email.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");

        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");

        }


    }
}
