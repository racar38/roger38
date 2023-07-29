package Practiceday_extra;

public class ornek25 {

    /*
    Alfabeyi konsola yazdırın.
   örnek:
   a b c .. .. .. .. y z
   ipucu: char kullanmak iyi bir fikir olabilir :
     */

    public static void main(String[] args) {

        char ilkHarf = 'a';
        char sonHarf = 'z';

        System.out.print("Alfabe : ");
        for (char i = ilkHarf; i <= sonHarf; i++) {

            System.out.print(i + " ");
        }

    }
}
