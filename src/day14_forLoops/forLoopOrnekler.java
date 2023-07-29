package day14_forLoops;

import java.util.Scanner;

public class forLoopOrnekler {

    public static void main(String[] args) {

        //SORU-1)  1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak
        //yazdirin.

        // for (int i = 1; i <=100 ; i++) //{
        //System.out.print( i + " " );
        // }


        //SORU 2) Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        //        dahil) 7 ila bolunebilen sayilari yazdirin.

        // Scanner scanner=new Scanner(System.in);
        // System.out.println("Lutfen pozitif bir tamsayi giriniz");
        // int girilenSayi= scanner.nextInt();

        // for (int i = 1; i <=girilenSayi ; i++) {
        //     if (i%7==0){
        //         System.out.print(i+" ");
        //     }
        // }

       /* Soru 4 ) Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
                    dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
                    baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin */

        // Scanner scanner=new Scanner(System.in);
        // System.out.println("Lutfen baslangic degerini pozitif bir tamsayi giriniz");
        // int baslangic= scanner.nextInt();
        // System.out.println("Lutfen bitis degerini pozitif bir tam sayi giriniz");
        // int bitis = scanner.nextInt();

        //if (bitis<baslangic){
        //    System.out.println("baslangic degeri bitis degerinden buyuk olmamali");
        //}else{
        //    int toplam=0;
        //    for (int i = baslangic; i <=bitis ; i++) {
        //        toplam=toplam+i;
        //    }
        //    System.out.println("Sinirlar arasindaki tamsayilar toplami : " + toplam );
        //}


       /* Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
               dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
               baslangic degerinden kucuk olsa da program calissin */

        // Scanner scanner=new Scanner(System.in);
        // System.out.println("Lutfen baslangic degerini pozitif bir tamsayi giriniz");
        // int baslangic= scanner.nextInt();
        // System.out.println("Lutfen bitis degerini pozitif bir tam sayi giriniz");
        // int bitis = scanner.nextInt();

        // if (baslangic<bitis){
        //     int toplam=0;
        //     for (int i = baslangic; i <=bitis ; i++) {
        //         toplam+=i;
        //     }
        //     System.out.print("Sinirlar arasindaki tamsayilar toplami : " + toplam);
        // } else if (bitis<baslangic) {
        //     int toplam=0;
        //     for (int i = bitis; i <baslangic ; i++) {
        //         toplam+=i;
        //     }
        //     System.out.println("Sinirlar arasindaki tamsayilar toplami : " + toplam);
        // }


        /* SORU 5) Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
                   hesaplayin */


        // Scanner scanner=new Scanner(System.in);
        // System.out.println("Lutfen 20'den kucuk pozitif bir tam sayi giriniz");
        // int sayi= scanner.nextInt();

        // int carpim =1;
        // for (int i = 1; i <= sayi; i++) {

        //    carpim*=i;
        //}
        //System.out.println("Girilen sayinin faktoriyel degeri : " + carpim);

        //SORU-7) Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        // Scanner scanner=new Scanner(System.in);
        // System.out.println("Lutfen  pozitif bir tam sayi giriniz");
        // int girilenSayi= scanner.nextInt();
//
        // int sayi=girilenSayi;
        // int birlerBasamagi=0;
        // int rakamlarToplami=0;
        // int basamakSayisi=(sayi+"").length();   // basamak sayısı suresince tekrar etmesi icin loop'un
        //                                          // hiçlik ekleyerek sayiyi string yaptik
        // for (int i = 1; i <=basamakSayisi ; i++) {
        //     birlerBasamagi=sayi%10;
        //     rakamlarToplami+=birlerBasamagi;
        //     sayi/=10;
        // }
        // System.out.println("Girilen sayinin rakamlari toplami : " + rakamlarToplami);

        /* Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
        tamsayilari yazdirin, sira
         3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
         5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
         hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz */

     //   Scanner scanner = new Scanner(System.in);
     //   System.out.println("Lutfen pozitif bir tamsayi giriniz");
     //   int sayi = scanner.nextInt();
//
     //   for (int i = 1; i <= sayi; i++) {
     //       if (i % 3 == 0 && i % 5 == 0) {
//
     //           System.out.print("fizzBuzz\n");
     //       } else if (i%3==0) {
     //           System.out.print("fizz");
//
     //       } else if (i%5==0) {
     //           System.out.print("buzz");
     //       }else{
     //           System.out.print(i + " ");
     //       }
     //   }
//

           /*  SORU 9 ) (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.*/

         Scanner scanner = new Scanner(System.in);
         System.out.println("Lutfen string cumle giriniz");
         String cumle = scanner.nextLine();

        for (int i = cumle.length()-1; i >=0 ; i--) {
            System.out.print(cumle.charAt(i));
        }

    }
}
