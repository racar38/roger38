package day21_arrays;

public abstract class Arrays_ornek {

    /*
Verilen bir array'de  istenilen elemanın olup olmadığını kontrol eden
varsa kaç kere kullanıldığını yazdıran bir method oluşturunuz.
{2,3,4,5,6,7,5,8,3,5,7,5,2,5}
 */
    public static void main(String[] args) {

        int[] arr={2,3,4,5,6,7,5,8,3,5,7,5,2,5};

        istenenElamaniAra( arr, 15);

    }


    public static void istenenElamaniAra(int[] arr, int istenen) {
        int flag=0;

        for (int i = 0; i < arr.length; i++) {

            if (istenen==arr[i]){
                flag++;
            }
        }
        if (flag!=0){
            System.out.println("istenen  array'de " + flag+" adet kullanılmıştır");
        }else{
            System.out.println("istnen arayda kullanılmamıştır");
        }


    }
}




