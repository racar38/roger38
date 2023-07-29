package day26_forEachLoop_constructor;

import java.util.Arrays;

public class C02_HarfKullanimAdedi {
    public static void main(String[] args) {

        /*
          Kullanicidan bir cumle ve bir harf alin
          harf cumlede kullanilmisssa kac kere kullanildigini
          kullanilmadiysa "harf cumlede kullanilmamis" yazdirin
         */

        String cumle ="Java her gecen gun daha zevkli hale geliyor";
        String harf="b";

        String[] cumleArr=cumle.split("");
        System.out.println(Arrays.toString(cumleArr));
        int sayac=0;
        for (String each:cumleArr
             ) {

            if (each.equals(harf)){
                sayac++;
            }

        }

      if (sayac==0){
          System.out.println("aradiginiz harf cumlede kullanilmamistir");
      }else {
          System.out.println("aradiginiz" + harf+" harfi cumlede " + sayac+" kere kullanilmis");
      }
    }
}
