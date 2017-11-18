//http://codeforces.com/problemset/problem/75/A
package me.motyim.old.acm;

import java.util.Scanner;

public class LifeWithoutZeros {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int s=x+y;
        int ns=WithoutZero(x)+WithoutZero(y);
        if(ns==WithoutZero(s))
            System.out.println("YES");
        else System.out.println("NO");
        
    }
    public static int WithoutZero(int x){
        StringBuffer s=new StringBuffer();
        while(x!=0){
            if(x%10!=0){
                s.append(x%10);
            }
            x/=10;
        }
        String m=new String(s.reverse());
        return Integer.parseInt(m);
    }
    
}
