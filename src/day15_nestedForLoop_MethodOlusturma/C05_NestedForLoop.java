package day15_nestedForLoop_MethodOlusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        int satir=5;
        int sutun=7;

           // dikdortgen biciminde satir ve sutun numaralari yazdiralim

        for (int i = 1; i <=satir ; i++) {   // satirlari kontrol eder

            for (int j = 1; j <= sutun; j++) {    // sutunlari kontrol eder
                System.out.print(i+","+j+"    ");
            }
            System.out.println();
        }

        // UCGEN BICIMINDE SATIR VE SUTUN NUMARALARINI YAZDIRALIM

        for (int i = 1; i <= satir; i++) {      // satir

            for (int j = 1; j <=i ; j++) {  // sutun
                System.out.print(i+","+j+"    ");
            }
            System.out.println();
        }

    }
}
