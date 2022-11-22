package studies01;

import java.util.Arrays;
import java.util.Scanner;

// nums = [1,2,3,4,5,6,7], k = 3 output=[5,6,7,1,2,3,4] elemanlari istenen sayi kadar saga kaydiran kodu yaziniz?
public class Study06 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        System.out.println("kaydirmak istediginiz sayiyi giriniz");
//        int sayi= input.nextInt();
//        int nums[]={1,2,3,4,5,6,7};
//
//        int arr[]=new int[nums.length];
//
//        int counter=sayi;
//
//        for (int i=0; i<nums.length; i++){
//            arr[sayi]=nums[i];
//
//            if(sayi==6){
//              sayi=-1;
//            }
//
//            sayi++;
//
//            if(sayi==counter){
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        int arr[] = {1,2,3,4,5,6,7};

        int brr[] = new int[arr.length];
        int k = 3;
        int idx = 0;

        for(int i = 0; i<=arr.length-1; i++){

            if(arr.length-k < arr.length){
                brr[i]=arr[arr.length-k];
                k--;
            }else  {
                brr[i] = arr[idx];
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

    }
}
