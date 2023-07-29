package Practiceday_extra;

public class ornek_IndexOf {

    public static void main(String[] args) {

        String str = "Java en iyisi";

        // SORU: Verilen cümlede istenen bir string icin
        //       asagidaki cumlelerden uygun olani yazdirin
        //       1-aradiginiz kelime cumlede 1 kere kullanilmis
        //       2-aradiginiz kelime cumlede 2 kere kullanilmis

        if (str.indexOf("en")==-1){
            System.out.println("Bu cumlede aradiginiz kelime yok");
        }else {
            int birinciIndex = str.indexOf("en");
            if (str.indexOf("en",birinciIndex+1)==-1){
                System.out.println("aradiginiz kelime 1 defa kullanilmis");
            }else {
                System.out.println("aradiginiz kelime 2 kere veya daha fazla kullanilmis");
            }
        }
    }
}
