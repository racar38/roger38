package day15_nestedForLoop_MethodOlusturma;

public class carpimTablosu {

    public static void main(String[] args) {

      int satir=3;
      int sutun=4;

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=sutun ; j++) {
                int carpim=i*j;
                System.out.print(i+"*"+j+""+ "="+carpim+" ");
            }
            System.out.println();
        }

        System.out.println("==================");

        String str="*";
        for (int i = 1; i <=3 ; i++) {
            System.out.println("");
            for (int j = 1; j <=4 ; j++) {
                System.out.print((j+str+i)+":"+(i*j)+" ");
            }
        }
    }
}
