package day11_stringManipulation;

public class working {

    public static void main(String[] args) {

        String str="Java Cok Guzel";
        System.out.println(str.lastIndexOf("Cok",4));
        System.out.println(str.replace("a", "e"));
        System.out.println(str.replaceFirst("a", "e"));
        System.out.println(str.replace('J', 'T'));


    }
}
