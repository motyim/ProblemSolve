//http://codeforces.com/problemset/problem/112/A
package me.motyim.old.acm.String;

import java.util.Scanner;

public class PetyaandStrings {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String m=in.next();
        int k=s.compareToIgnoreCase(m);
        if(s.compareToIgnoreCase(m)>0)
            System.out.println("1");
        else if(s.compareToIgnoreCase(m)==0)
            System.out.println("0");
        else System.out.println("-1");
    }
    
}
