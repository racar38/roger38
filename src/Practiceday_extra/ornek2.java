package Practiceday_extra;

import java.util.Scanner;

public class ornek2 {

    public static void main(String[] args) {

        // Soru 1 : Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");

        String girilenCumle= scanner.nextLine();
        int index1 = girilenCumle.indexOf("ev");

        if (index1!=-1){
            System.out.println("home home sweet home");
        }
        int index2 =girilenCumle.indexOf("is");

                if (index2!=-1){
            System.out.println("calismak guzeldir");

               } else if (index1!=-1 && index2!=-1) {
            System.out.println("Hem ev lazim hem is");
               } else if (index1==-1 && index2==-1) {
                    System.out.println("cok calisman lazim");
                }

        }


        }


