//http://www.spoj.com/problems/SAMER08F/
package me.motyim.old.acm;

import java.util.Scanner;

public class Feynman {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int []a =new int [10];
        int i=0;
        while(true){
            int n=in.nextInt();
            if(n==0){
                break;
            }
            calD(n,a,i);
            i++;
            if(i==a.length-1){
                a=largA(a,i);
            }
        }
        for (int j = 0; j < a.length; j++) {
            if(a[j]==0){
                break;
            }
            System.out.println(a[j]);
        }
    }
    public static int[] largA(int []a,int i){
        int []b=new int [i*2];
        System.arraycopy(a, 0, b, 0, i);
        return b;
    }
    public static void calD(int n,int[]a,int i){
        int total=0;
        while(n>0){
            total=total+(n*n);
            n--;
        }
        a[i]=total;
    }
    
}
