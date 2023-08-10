import java.awt.geom.Arc2D;
import java.util.Locale;

public class StringManipulation {

    public static void main(String[] args) {

      String str1="Bugun gunlerden carsamba";
      String str2="Dun gunlerde sali";

       // System.out.println(str1.toLowerCase()); // bugun gunlerden carsamba
        //System.out.println(str1.toLowerCase(Locale.forLanguageTag("Tr")));



        // System.out.println(str1 == str3);

       // System.out.println(str1.equalsIgnoreCase(str3));

        //System.out.println(str3.charAt(3)); // g

        // System.out.println(str3.length());// 25
       // System.out.println(str3.substring(5)); // n gunlerden carsamba
        //System.out.println(str3.substring(5, 10)); // n gun

       // System.out.println(str1.concat(str3)); // Bugun gunlerden carsamba Bugun gunlerden carsamba

       // System.out.println(str3.contains("c")); // true

       // System.out.println(str3.startsWith(" Bugun"));
       // System.out.println(str3.startsWith("gun", 7)); // true
       // System.out.println(str3.endsWith("ba"));
        // System.out.println(str3.indexOf("gunlerden")); // 7

        String str3=" Bugun gunlerden carsamba";

        // System.out.println(str3.lastIndexOf("gun", 5));
        String str4=" ";

       // System.out.println(str4.isEmpty()); // false
       // System.out.println(str4.isBlank()); // true

       // System.out.println(str3.replace("B", "D"));// Dugun gunlerden carsamba

       // System.out.println(str3.replace(" Bugun", "Dun")); // Dun gunlerden carsamba

        //System.out.println(str3.replaceAll("\\w", ""));
       // System.out.println(str3.repeat(2)); //  Bugun gunlerden carsamba Bugun gunlerden carsamba
       // System.out.println(str3.trim()); // Bugun gunlerden carsamba

        StringBuilder str6=new StringBuilder("Kava Her Sey");

        //System.out.println(str6.substring(2));
        //System.out.println(str6.insert(6, 1));
       //System.out.println(str6);
        //System.out.println(str6.insert(4, "Cok")); // JavaCok H1er Sey

        StringBuilder str7=new StringBuilder("Java Her Sey");


        System.out.println(str6.compareTo(str7)); // -1

        System.out.println(str6.reverse());
        System.out.println(str6.reverse());

        StringBuilder asas=new StringBuilder();


    }
}
