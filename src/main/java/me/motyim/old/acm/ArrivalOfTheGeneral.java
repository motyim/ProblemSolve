//http://codeforces.com/problemset/problem/144/A
package me.motyim.old.acm;

import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] a=new int [n];
        int max=0,min=100;
        int xi=0,mi=n;
        for (int i = 0; i < a.length; i++) {
            a[i]=in.nextInt();
            if(a[i]>max){
                max=a[i];
                xi=i;
            }
            if(a[i]<=min){
                min=a[i];
                mi=i;
            }
        }
        int xt=0,mt=0;
        if(mi>xi){
           xt=xi;
           mt=a.length-1-mi;
           System.out.println(xt+mt);
           System.exit(0);
        }
        if(xi>mi){
            mt=a.length-1-mi;
            xt=xi-1;
            System.out.println(mt+xt);
            System.exit(0);
        }
        //System.out.println("max = "+max+" index : "+xi);
        //System.out.println("min = "+min+" index : "+mi);
    }
    
}
