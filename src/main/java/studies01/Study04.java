package studies01;

import java.util.Arrays;
import java.util.Scanner;

public class Study04 {
         /*
        Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
        Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
         */

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        int arr[]={12, 5, 8};
        int brr[]={12, 5, 8, 13};

        int num=brr.length;

        if (num%2==0){

            System.out.println("("+arr[num/2-1]+"+"+arr[num/2]+")/2 = "+(arr[num/2-1]+arr[num/2]));
        }else
            System.out.println(arr[num/2]);






    }


}
