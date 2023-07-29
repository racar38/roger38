package day13_stringManipulations_forLoop;

public class C02_replaceAll {

    public static void main(String[] args) {

        String str = "1Ja4va 8C9a2n5d1i1r.";

        System.out.println(str.replace("1", "")); // Ja4va 8C9a2n5dir.

        // sayilarin tamamindan kurtulmak istersek
        //replace () yeterli olmaz

        // java da sayilar,ozel karakterler,alfabetik karakterlerin
        //tumuyle islem yapmak isterseniz
        //replaceAll ( istenenGrup,yeniDeger)

        // orenegin butun sayilarin yerine "" atamak icin

        str=str.replaceAll("\\d","");
        System.out.println(str); // Java Candir.

        System.out.println(str.replaceAll("1,4,8,9,2,5,1,1", ""));

    }
}
