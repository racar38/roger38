package practice_day08;
// Bir "Rectangle" sınıfı oluşturun ve bu sınıfın iki constructor'ı olsun.
// İlk constructor, uzun ve genişlik değerlerini alacak şekilde tasarlanmalıdır.
// İkinci constructor ise sadece bir boyut değeri alacak şekilde tasarlanmalıdır (kare).

// Aynı zamanda, bu constructor içinden "display" adında bir metodu çağırarak boyutları ekrana yazdırın.

// Örnek çıktı:
// Uzunluk: 8, Genişlik: 6
// Kenar uzunluğu: 5 (Kare)
public class Rectangle {

 int uzunluk;
 int genislik;

 public Rectangle(int uzunluk,int genislik){

     this.uzunluk=uzunluk;
     this.genislik=genislik;
     display();
 }

 public Rectangle(int boyut){
     this.uzunluk=boyut;
     this.genislik=boyut;
     display();

    }

    public void display() {

        if (uzunluk==genislik){
            System.out.println("boyut : " +uzunluk +" (Kare)");

        }else {
            System.out.println("uzunluk : "+uzunluk +" genislik : " +genislik);
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(6,8);
        Rectangle rectangle1=new Rectangle(5);
    }

}

// EGER İF ELSE KULLANMAK İSTEMİYORSAN DİSPLAY() VE DİSPLAY2() SEKLİNDE 2 ADET METHOD OLUSTURUP YAPMAMIZ GEREKİR







