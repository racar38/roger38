package day26_forEachLoop_constructor;

public class C01_EnBuyukElementiBulma {
    public static void main(String[] args) {

        // array'in elementlerinden en buyuk olani bulun

        int[] arr ={2,5,6,8,7,9,3,5,6,8,32,21,65,};

        int enBuyukElement=arr[0];

        for (int each:arr  // arr deki her bir elementi bana getir anlaminda
             ) {
            if (each>enBuyukElement){
                enBuyukElement=each;
            }

        }
        System.out.println("Array'deki en buyuk element : " +enBuyukElement);
    }
}
