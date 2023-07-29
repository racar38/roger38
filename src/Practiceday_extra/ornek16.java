package Practiceday_extra;

import java.util.Scanner;

public class ornek16 {


    /*
                Soru 16-)
            Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
           -> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
         -> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
           Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
            Örn:
	              isim1= masa
                       isim2= ali
	                 Konsol => maalisa
                 */
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ilk ismi giriniz");
        String isim1= scanner.nextLine();
        System.out.println("Lutfen ikinci ismi giriniz");
        String isim2=scanner.nextLine();




        if (isim1.length()%2==0){
           int ortaIndex=isim1.length()/2;
           String birinciKisim=isim1.substring(0,ortaIndex);
           String ikinciKisim=isim1.substring(ortaIndex);
           String birlesikIsim=birinciKisim.concat(isim2).concat(ikinciKisim);
            System.out.println(" sonuc : " + birlesikIsim);

        }else{
            System.out.println("isim2, isim1'e eklenemez");
        }
    }
}
