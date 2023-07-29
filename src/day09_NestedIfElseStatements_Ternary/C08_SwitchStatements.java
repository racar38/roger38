package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C08_SwitchStatements {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan ay numarasini alip ay ismini yazdirin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Yazdirmak istediginiz ay , kacinci ay ?");

        int ayNo = scanner.nextInt();

        if (ayNo==1) System.out.println("ocak");
        else if (ayNo==2) System.out.println("subat");
        else if (ayNo==3) System.out.println("mart");
        else if (ayNo==4) System.out.println("nisan");
        else if (ayNo==5) System.out.println("mayıs");
        else if (ayNo==6) System.out.println("haziran");
        else if (ayNo==7) System.out.println("temmuz");
        else if (ayNo==8) System.out.println("agustos");
        else if (ayNo==9) System.out.println("eylul");
        else if (ayNo==10) System.out.println("ekim");
        else if (ayNo==11) System.out.println("kasim");
        else if (ayNo==12) System.out.println("aralik");
        else System.out.println("Ay numarasi yanlis");

        /*
                Switch Statement kullaniminda dikkat edilecek konular.
                    1- Switch Statement’da switch parantezinde long, double, float ve boolean kullanilamaz.
                    2- Switch Statement’da switch parantezinde yazilan degere uygun case calisir ve break
                    gorunceye veya switch case bitinceye kadar calismaya devam eder.

         */

        switch (ayNo){

            case 1 :
                System.out.println("ocak");
                break;
            case 2 :
                System.out.println("subat");
                break;
            case 3 :
                System.out.println("mart");
                break;
            case 4 :
                System.out.println("nisan");
                break;
            case 5 :
                System.out.println("mayis");
                break;
            case 6 :
                System.out.println("haziran");
                break;
            case 7 :
                System.out.println("temmuz");
                break;
            case 8 :
                System.out.println("agustos");
                break;
            case 9 :
                System.out.println("eylül");
                break;
            case 10 :
                System.out.println("ekim");
                break;
            case 11 :
                System.out.println("kasim");
                break;
            case 12 :
                System.out.println("aralik");  // break olarak bitirilmesze numara sonrası olan herseyi yazdirir
                break;

            default:
                System.out.println("Ay numarasi yanlis");

        }

        }
    }




