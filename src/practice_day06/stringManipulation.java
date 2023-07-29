package practice_day06;

import java.util.Scanner;

public class stringManipulation {

     /*
Kullanicidan bir cumle alin
    - cumlede ev geciyorsa, "home home sweet home" yazdirin
    - cumlede is geciyorsa, "calismak guzeldir"
    - ikisini de iceriyorsa "Hem ev lazim hem is"
    - hicbirini icermiyorsa "cok calisman lazim" yazdirin.
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine().toLowerCase();


        if (cumle.contains("ev") && cumle.contains("iş")){
            System.out.println("Hem ev lazim hem is");

        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");

        } else if (cumle.contains("iş")) {
            System.out.println("calismak guzeldir");

        }else{
            System.out.println("cok calisman lazim");
        }
    }
}
