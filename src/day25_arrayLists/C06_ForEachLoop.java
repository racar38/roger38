package day25_arrayLists;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        int[] arr={20,30,5,45};

        // array'in tum elementlerini toplayin
        //array'in tum elementlerini yazdirin
        //array'in  elementlerinden cift sayi olanlari yazdirin
        //array'in  elementlerinden en buyuk olani bulun

        /*
          Array'in tum elementlerini gozden gecirmemiz gereken sorularda for loop kullaniriz

          For Loop'un en onemli ozelligi index sayesinde tum elementleri
          0.index'den sonuncu indexe kadar sirali olarak getirmesidir

          ama bu sorularda elementleri sirasiyla getirmesinin onemi yok
          sadece tum elementlerin gozden gecirilmesi istenmektedir
          bu durumlarda for loop yerine for-each-loop kullaniriz
          array'e git her bir elementi bana getir anlaminda
         */

        //array'in tum elementlerini yazdirin

        for (int each:arr
             ) {
            System.out.print(each+" ");
        }
    }
}
