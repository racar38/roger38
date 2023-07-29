package Practiceday_extra;

import java.util.Arrays;

public class elamanlariBirKaydirma {

    public static void main(String[] args) {

        // verilen bir array'deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun, array'i yeni haliyle kaydedin

        int[] arr= {13,20,50,43};

        System.out.println(Arrays.toString(arr));

        arr=elementleriBirKaydirma(arr);             // array'i yeni haliyle kaydettik
        System.out.println(Arrays.toString(arr));

    }

    public static int[] elementleriBirKaydirma(int[] arr){

        int sonElement=arr[arr.length-1];

        for (int i = arr.length-2; i >=0 ; i--) {

            arr[i+1]=arr[i];   // indexleri 1 artirip arr'ye atama yapiyoruz
        }
        arr[0]=sonElement;  // son elementi başa atadik
        return arr;
    }

}
