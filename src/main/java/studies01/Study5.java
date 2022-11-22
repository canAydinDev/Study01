package studies01;

import java.util.Scanner;

public class Study5 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Input :");
        System.out.println("");

       int a= input.nextInt();
        System.out.println("");
        int b= input.nextInt();
        System.out.println("");
       int a1,a2,b1,b2;
        a1=a;
        a2=a;
        b2=b;
        b1=b;

       int obeb=1;
       for (int i=2; i<=b; i++){

           if (a1%i==0&&b1%i==0){
               a1/=i;
               b1/=i;
               obeb*=i;
               i--;
           }
       }System.out.println(a+" ve "+b+" icin GCD = "+obeb);
        System.out.println("");

       int okek=1;

        for (int j=2; j<=b; j++){
            if (b2%j==0||a2%j==0){
               if (b2%j==0){
                   b2/=j;
               }
               if (a2%j==0){
                   a2/=j;
               }
                okek*=j;
                j--;
            }

        }System.out.println(a+" ve "+b+" icin LCM = "+okek);


    }
}
