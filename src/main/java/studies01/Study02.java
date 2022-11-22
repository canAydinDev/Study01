package studies01;

import java.util.Scanner;

public class Study02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sutun satir sayisi giriniz...");
        int str = input.nextInt();
        System.out.println("Blok sayisi giriniz...");
        int blk = input.nextInt();

        int j, i;

        for ( i = 1; i <= str; i++) {

            for (j = 1; j <= blk; j++) {
                if (i==1 || i==str) {
                    System.out.print("A");
                } else if ((j == 1 || j == blk)) {
                    System.out.print("A");
                }else if (j != 1 || j != blk) {
                    System.out.print("X");
                }
            }
            System.out.println(); //bitis
        }


    }
}
