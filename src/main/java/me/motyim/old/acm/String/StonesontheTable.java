//http://codeforces.com/problemset/problem/266/A
package me.motyim.old.acm.String;

import java.util.Scanner;

public class StonesontheTable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        StringBuffer s=new StringBuffer(in.next());
        int m=0;
        for (int i = 0; i <x-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                m++;
            }
        }
        System.out.println(m);
    }
    
}
