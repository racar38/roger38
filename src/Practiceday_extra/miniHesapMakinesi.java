package Practiceday_extra;

public class miniHesapMakinesi {

    /*
    kullanicinin verdiği iki sayi ve sececegi isleme gore
    sonucu bize double olarak döndüren bir method olusturun
    örnegin; 3 ve 5 sayilari verisin işlem * secildiğinde 15 döndürsün
     */

    public static void main(String[] args) {


     miniHesapMakinesi(8,5,'*')  ;
    }

    public static double miniHesapMakinesi(int sayi1,int sayi2,char sembol){

        double sonuc=0;
        switch (sembol){
            case '+' :
               sonuc=sayi1+sayi2;
                System.out.print("islem sonucu : "+sonuc);
                break;
            case '-' :
                sonuc=sayi1-sayi2;
                System.out.print("islem sonucu : "+sonuc);
                break;
            case '*' :
                sonuc=sayi1*sayi2;
                System.out.print("islem sonucu : "+sonuc);
                break;
            case  '/' :
                sonuc=sayi1/sayi2;
                System.out.print("islem sonucu : "+sonuc);
                break;
            default:
                System.out.println("gecersiz sembol girisi yaptiniz...");
        }
        return sonuc;
    }
}
