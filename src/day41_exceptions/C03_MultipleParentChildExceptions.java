package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_MultipleParentChildExceptions {
    public static void main(String[] args) {

        String dosyaYolu="src/day41_exceptions/dosya.txt";

        try {
            FileInputStream fis= new FileInputStream(dosyaYolu);
            int k=0;                                                  // hazir sablon yapıstırdık...
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {

            System.out.println("verilen dosya yolu hatali,dosya bulunamadi");

        } catch (IOException e) {
            System.out.println("Dosya okunamiyor");

        }
    }
}
