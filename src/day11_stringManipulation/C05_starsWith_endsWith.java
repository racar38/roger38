package day11_stringManipulation;

public class C05_starsWith_endsWith {
    public static void main(String[] args) {

        String str = "Java cok guzel";

        //str Java ile mi basliyor ?

        System.out.println(str.startsWith("Java"));  // true
        System.out.println(str.startsWith("Ja"));    // true
        System.out.println(str.startsWith("J"));   // true
        System.out.println(str.startsWith("Java cok guzel")); // true
        System.out.println(str.startsWith(""));   // true

        // 5. indexden sonrasi c ile mi başlar

        System.out.println(str.startsWith("c" ,5)); // true

        // 6. indexden sonrasi ok ile mi baslar

        System.out.println(str.startsWith("ok",6)); // true


        // endsWith() istenilen bir yazinin , belli bir yazi parcaciginin ile bitip/bitmedigini kontrol eder
        // str guzel ile mi biter
        System.out.println(str.endsWith("guzel"));  //true
        // str "" ile mi biter
        System.out.println(str.endsWith(""));   // true hiçlik ile biter

        System.out.println(str.endsWith(" ")); //false


    }
}
