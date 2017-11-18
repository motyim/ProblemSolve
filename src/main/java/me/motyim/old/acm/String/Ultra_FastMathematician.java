//http://codeforces.com/problemset/problem/61/A
package me.motyim.old.acm.String;

import java.util.Scanner;

public class Ultra_FastMathematician {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String m=in.next();
        StringBuffer b=new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==m.charAt(i))
                b.append('0');
            else b.append('1');
        }
        System.out.println(b);
    }
    
}
