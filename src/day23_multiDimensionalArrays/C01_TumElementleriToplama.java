package day23_multiDimensionalArrays;

public class C01_TumElementleriToplama {

    public static void main(String[] args) {

        int[] arrTek= {3,7,1,9};
        //bu array'in tum elementlerini toplayin

        int toplam=0;

        for (int i = 0; i <arrTek.length ; i++) {

            // arr[i] index degistikce bize arraydeki tum elementleri sirasiyla getirir
            toplam+=arrTek[i];
        }
        System.out.println("arrTek'in elementleri toplami: " + toplam);

        int[][] sayilar={{1,2,5},{7,4},{9},{3,0,1}};

        // arr[i] inner array'leri getirir
        //arr[][] bize int elementleri verir

       toplam=0;

        for (int i = 0; i < sayilar.length ; i++) { // disardaki for loop outer array i kontrol eder

            for (int j = 0; j < sayilar[i].length; j++) {   // icerdeki for loop inner arrayleri kontrol eder

                // sayilar[i][j] sirasiyla her bir int elementi getirir
                toplam+=sayilar[i][j];
            }
        }
        System.out.println("Sayilar array'in elementleri toplami: " + toplam);

    }
}
