package day13_stringManipulations_forLoop;

public class C04_replaceFirst {

    public static void main(String[] args) {

        String str="Java Candir, kendisini cok seviyoruz";

        // sadece ilk a'yi BUYUK A yapin

        System.out.println(str.replaceFirst("a", "A")); // JAva Candir

        // JAva candir, kendisini cok seviyoruz
        // ilk space'i iki space haline getirin

        System.out.println(str.replaceFirst(" ","  ")); //Java  Candir, kendisini cok seviyoruz

        
    }
}
