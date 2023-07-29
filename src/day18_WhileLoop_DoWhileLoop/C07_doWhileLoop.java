package day18_WhileLoop_DoWhileLoop;

public class C07_doWhileLoop {

    public static void main(String[] args) {

       /*
           3 cesit loop gorduk
           hepsinin avantajlari ve dezavantajlari var

           1- for loop baslangic ve sonucu belirli sayi olan durumlarda
              veya kac kere tekrar edecegimizi bildigimiz durumlarda avantajli

           2- while loop kac kere tekrar edecegini bilmedigimiz islemleri
              yapmak icin avantajli

           3- do-while loop kullanicidan deger alarak yaptigimiz islemlerde
              ilk deger atamasini kod yazan kisinin degilde kullanicinin yapmasi acisindan avantajli
        */

        int bas=10;
        int bit=20;
        int toplam=0;
        //while loop ile baslangic degeri ile bitis degeri arasindaki
        // sayilari toplayip yazdirin (sinirlar dahil)
        // baslangic degeri bitis'ten buyukse,toplama olmamali

        while (bas<=bit){

            toplam+=bas;
            bas++;

        }
        System.out.println("while loop ile Sayilarin toplami : " + toplam);   // Sayilarin toplami : 165


        // simdi de do while loop ile yapalim

        bas=10;
        bit=20;
        toplam=0;
        do {
            toplam+=bas;
            bas++;
        }while (bas<=bit);

            System.out.println("do while loop ile Sayilarin toplami : " + toplam);
        }

    }
