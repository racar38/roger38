package day13_stringManipulations_forLoop;

public class C06_forLoopDikkatEdilecekler {

    public static void main(String[] args) {

        // verdigimiz baslangic degeri , bitis sartini saglamazsa
        // for loop calisir ANCAK for loop body'si DEVREYE GIRMEZ


        for (int i = 0; i >10 ; i++) {
            System.out.print(i+" ");
        }

        // BASLANGİC DEGERİ VE DEGİSİM SEKLİ,HİC  BİR ZAMAN BİTİS DEGERİNE ULASMAZSA
        // sonsuz loop olusur (biz durdurana kadar yada pc ram error verinceye kadar devam eder :))

        /*
         for (int i = 0; i >=0 ; i++) {
             System.out.print(i+" ");

          */

        //Kullanicin verdigi baslangic ve bitis degerleri dahil olarak
        // bu sayilarin arasinda aranan sayiya tam bolunebilen bir sayi varsa
        // "aranan sayi ile tam bolunebilen bir sayi var" yazdirin

        int baslangic=201;

        int bitis=237;

        int arananSayi=43;

        for (int i = baslangic; i <= bitis ; i++) {

            System.out.println(i);
            if (i%arananSayi==0){
                System.out.print("aranan sayi ile tam bolunebilen bir sayi var");
                break;           //  'break 'tamamdir for loop'u birak diger sayilara bakmana gerek yok
                                 //  break oldugu icin 215 de aramayı sona erdirir yoksa bitis degerine kadar
                                 // devam eder
                /*
                  bir loop devam ederken eger bir degerde istedigimiz islem gerceklesir
                  ve loop 'un geri kalanina ihtiyacimiz olmazsa orada break kullaniriz
                  JAVA BREAK ; komutunu gordugunde loop'u calistirmayi birakir.
                 */
        }


        }
    }
}
