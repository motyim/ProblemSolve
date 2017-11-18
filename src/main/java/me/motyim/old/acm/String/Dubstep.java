//http://codeforces.com/problemset/problem/208/A
package me.motyim.old.acm.String;

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        s=s.replaceAll("WUBWUB"," ");
        s=s.replaceAll("WUB"," ");
        s=s.trim();
        System.out.println(s);
    }
    
}
