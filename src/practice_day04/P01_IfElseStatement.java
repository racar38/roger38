package practice_day04;

import java.util.Scanner;

public class P01_IfElseStatement {

    public static void main(String[] args) {

        /*
          SORU:) KENAR DEGERLERİ GİRİLEN ÜCGENİN DİK UCGEN OLUP OLMADIGINI KONTROL EDIP
          DÖNÜT VEREN KOD DİZİSİNİ YAZINIZ

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Kontrol edilecek ucgenin kenarlarinin uzunluklarini giriniz");
        System.out.print("birinci kenarin uzunlugu: ");
        int a= scanner.nextInt();
        System.out.print("ikinci kenar uzunlugu : ");
        int b= scanner.nextInt();
        System.out.print("ucuncu kenari giriniz :");
        int c= scanner.nextInt();
        System.out.println("================= 1.Çözüm============");

        if ((a*a)+(b*b)==(c*c)){
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgen");
        } else if ((a*a)+(c*c)==(b*b)) {
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgen ");
        } else if ((c*c)+(b*b)==(a*a)) {
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgen");
        }else{
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgen degildir");
        }
        System.out.println("===============2.Çözüm============");

        if ((a*a)+(b*b)==(c*c) || (a*a)+(c*c)==(b*b)|| (a*a)+(c*c)==(b*b) ){
            //    || OR(VEYA) isareti ile yazilanlardan sadece birinin dogrulanmasi yeterlidir
            //    && AND(VE) isareti ile yazilanlardan tamami dogru olmasi gerekir
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgen");
        }else{
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgen degildir");
        }

        //CI-CD :  Contunie Integration


        System.out.println("=============3.Çözüm===========");

        System.out.println(((a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (a * a) + (c * c) == (b * b) ?
                "Girdiginiz degerlere sahip ucgen dik ucgen"
                : "Girdiginiz degerlere sahip ucgen dik ucgen degildir"));

        // TERNARY METHODU İLE DE COZULEBILIR
    }
}
