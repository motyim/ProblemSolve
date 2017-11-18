//http://codeforces.com/problemset/problem/145/A
package me.motyim.old.acm;

import java.util.Scanner;

public class LuckyConversion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        int operations=0;
        int n7=0,n4=0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                operations++;
                if(s2.charAt(i)=='4')
                    n4++;
                else n7++;
            }  
        }
        if(n4>n7){
            operations-=n7;
        }
        else {
            operations-=n4;
        }
        System.out.println(operations);
    }
    
}
