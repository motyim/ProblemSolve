//http://codeforces.com/problemset/problem/146/A
package me.motyim.old.acm;

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[]a=new int[n];
        String s=in.next();
        for (int i = 0; i < a.length; i++) {
            //look at this very im to convert char to int
            a[i]=s.charAt(i)-'0';
            if(a[i]!=7&&a[i]!=4){
                System.out.println("NO");
                System.exit(0);
            }
        }
        int FristN=0,SecandN=0;
        for (int i = 0; i < a.length/2; i++) {
            FristN+=a[i];
            SecandN+=a[(a.length-i-1)];
        }
        //System.out.println(FristN+" "+SecandN);
        if(FristN==SecandN)
            System.out.println("YES");
        else System.out.println("NO");
        
    }
    
}
