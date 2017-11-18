//http://codeforces.com/problemset/problem/94/A
package me.motyim.old.acm;

import java.util.Scanner;

public class RestoringPassword {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s =in.next();
        String [] e =new String [10];
        StringBuffer f =new StringBuffer();
        
        for (int i = 0; i < e.length; i++) {
            e[i]=in.next();
        }
        for (int i = 0; i <80; i+=10) {
            String p =s.substring(i, i+10);
            for (int j = 0; j < e.length; j++) {
                if(p.equals(e[j])){
                    f.append(j);
                    break;
                }
                
            }
            
        }
        System.out.println(f);
        
    }
}
