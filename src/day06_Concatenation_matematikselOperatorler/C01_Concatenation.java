package day06_Concatenation_matematikselOperatorler;

public class C01_Concatenation {
    public static void main(String[] args) {

        String s1 = "Java" ;
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";

        int a = 3;
        int b =5;

        //sadece yukaridaki variable'lari kullanarak
        //asagida verilen metinleri yazdirin

        //Java35 yazdirin

        System.out.println(s1+a+b);

        // Java15 yazdirin

        System.out.println(s1+(a*b)); // veya (s1+a*b)

        // 8Candir yazdirin

        System.out.println(a+b+s2);

        // 53Java yazdirin

        System.out.println(s4+b+a+s1);
        System.out.println(b+s4+a+s1);
        System.out.println(b+ (a+s1));

        // "23" ==> Integer Integer.parseInteger("23")==>23

        // 35 Java yazdirin

        System.out.println(s4+a+b+s3+s1);

    }
}
