package studies01;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Study01First {
    public static void main(String[] args) {
        /*
        aklinizdan 0 dan 99 a kadar bir sayi tutun ama programa girmeyin
        program calistiginda sayiyi tahmin etsin
        program sayinizi bulana kadar
        sayiniz tahminden buyukse 1 e basin
        sayiniz tahminden kucukse 2 ye basin
        program sayinizi bilirse 3 e basin ve program bildim di  mi desin
         */

       Scanner input=new Scanner(System.in);

        System.out.println("aklinizdan 0 dan 100 e kadar bir sayi tutun ...");
        System.out.println("pc sayinizi tahmin edecek. \neger sayiniz tahminden buyukse 1 e\nsayiniz tahminden kucukse 2 ye basiniz");

        int pc1=(int)(Math.random()*100);
        int deneme=1;
        int pc2=100;
        int pc3=0;
        System.out.println("sayiniz: "+pc1+ " mi?");
        int girdi;
       do {
           girdi= input.nextInt();
           deneme++;
           if (girdi==1){
               pc3=pc1;
               pc1=(pc1+pc2)/2;
               System.out.println("sayiniz: "+pc1+ " mi? "+ "tahmin sayisi : "+deneme);
           } else if (girdi==2) {
               pc2=pc1;
               pc1=(pc1+pc3)/2;
               System.out.println("sayiniz: "+pc1+ " mi? "+ "tahmin sayisi : "+deneme);
           }


       }while (girdi!=3);
        System.out.println("bildim di mi:)) ");


    }
}
