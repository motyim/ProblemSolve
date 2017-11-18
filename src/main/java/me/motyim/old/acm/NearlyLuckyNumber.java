//http://codeforces.com/problemset/problem/110/A
package me.motyim.old.acm;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long x=in.nextLong();
        int Lucky=0;
        while(x!=0){
            long n=x%10;
            if(n==7||n==4){
                Lucky++;
            }
            x/=10;
        }
        if(Lucky==7||Lucky==4)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
