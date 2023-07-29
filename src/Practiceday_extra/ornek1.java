package Practiceday_extra;

public class ornek1 {

    public static void main(String[] args) {

        //- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
        //yazdirin.

        int sayi=10;


        while (sayi<100){  // 2 basamakli sayilara kadar dongu devam eder

            if (sayi%7==0){ // sayi 7 ile bolunebiliyorsa

                System.out.print( sayi + "-");
            }
            sayi++;

        }

        }
    }

