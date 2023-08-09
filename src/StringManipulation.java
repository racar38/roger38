import java.awt.geom.Arc2D;

public class StringManipulation {

    public static void main(String[] args) {

     String str="Bugun hava cok sicak";

        str=str.toLowerCase();
        System.out.println(str);

     String str2="BUgun Hava Cok sicak";

        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str == str2);
        System.out.println(str.charAt(str.length()-1));

        System.out.println(str.concat(str2));

        System.out.println(str.contains("havali"));

        System.out.println(str.startsWith("bugun"));

        System.out.println(str.startsWith(" hava", 5));

        System.out.println(str.endsWith("sicak"));

        System.out.println(str.indexOf("u"));

        System.out.println(str.indexOf("hava"));

        System.out.println(str.indexOf("u", 7));


    }
}
