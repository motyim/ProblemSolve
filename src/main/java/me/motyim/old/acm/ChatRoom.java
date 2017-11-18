//http://codeforces.com/problemset/problem/58/A
package me.motyim.old.acm;

import java.util.Scanner;

public class ChatRoom {

    public static void main(String[] args) {
        String h="hello" , s ;
        boolean ok;
        Scanner in =new Scanner(System.in);
        s=in.next();
        int start=0 ;
        for (int i = 0; i < h.length(); i++) {
            ok =false;
            for (int j = start; j < s.length(); j++) {
                if(h.charAt(i)==s.charAt(j)){
                    start =j+1;
                    ok=true;
                    break;
                }     
            }
            if(!ok){
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");

    }

}
