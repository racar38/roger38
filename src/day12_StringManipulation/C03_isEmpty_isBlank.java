package day12_StringManipulation;

public class C03_isEmpty_isBlank {

    public static void main(String[] args) {

        String str1="";
        String str2= " ";
        String str3=".";
        System.out.println(str1.isEmpty());  // true
        System.out.println(str2.isEmpty());  // false
        System.out.println(str1.isBlank());  //true  // space mi demek blank--space
        System.out.println(str2.isBlank());  //true
        System.out.println(str3.isBlank());  //false
    }
}
