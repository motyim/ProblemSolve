//http://codeforces.com/problemset/problem/139/A
package me.motyim.old.acm.String;

import java.util.Scanner;

public class PetrAndBook {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[]a=new int[7];
        int day=0;
        for (int i = 0; i < 7; i++) {
            a[i]=in.nextInt();
        }
        while(n>0){
            for (int i = 0; i < 7; i++) {
                if(n<=0)
                    break;
                n-=a[i];
                day=i+1;
            }
        }
        System.out.println(day);
        
    }
    
}
