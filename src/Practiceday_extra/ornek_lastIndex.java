package Practiceday_extra;

public class ornek_lastIndex {

    public static void main(String[] args) {

        // verilen bir cumlede istenen bir string icin
        // asagidaki cumlelerden uygun olani yazdirin
        //1-aradiginiz kelime cumlede 1 kere kullanilmis
        //2-aradiginiz kelime cumlede 1'den fazla kullanilmis
        //3-aradiginiz kelime cumlede hic kullanilmamis

       String str1= "Java cok kolay";
       String str2 = "fazla";

       int basatanIndex=str1.indexOf(str2);
       int sondanIndex=str1.lastIndexOf(str2);

       if (basatanIndex==-1) {
           System.out.println("aradiginiz kelime cumlede hic kullanilmamis");

       } else if (basatanIndex==sondanIndex) {
           System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");

       } else {
           System.out.println("aradiginiz kelime cumlede 1'den fazla kullanilmis");
       }


    }
    }

