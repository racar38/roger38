package day13_stringManipulations_forLoop;

public class forLoop_ornek2 {

    public static void main(String[] args) {

        // verilen iki sayi ve aralarindaki tum sayilari toplayip yazdirin
        //iki sayidan hangisinin kucuk oldugu bilinmiyor

        int sayi1=100;
        int sayi2=20;
        int toplam=0;

        if (sayi1<sayi2){
            for (int i = sayi1; i <=sayi2 ; i++) {                 // ilk sayi ikinci sayidan kucukse calisir
                toplam+=i;
            }
        }else{
            for (int i = sayi1; i >=sayi2 ; i--) {                 // ilk sayi ikinci sayidan buyukse calisir
                toplam+=i;
            }
        }
        System.out.println(toplam);

 }
}
