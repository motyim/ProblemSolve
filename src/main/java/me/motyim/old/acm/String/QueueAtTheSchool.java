//http://codeforces.com/problemset/problem/266/B
package me.motyim.old.acm.String;

import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int n=in.nextInt();
        String s=in.next();
        for(int i=0;i<n;i++){
            s=s.replaceAll("BG","GB");
        }
        System.out.println(s);
    }
    
}
