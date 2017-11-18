//http://codeforces.com/problemset/problem/131/A
package me.motyim.old.acm;

import java.util.Scanner;

public class CapsLock {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        boolean ok = true;
        boolean lower=Character.isLowerCase(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                ok = false;
                break;
            }
        }
        if (ok & lower) {
            s = s.toLowerCase();
            char c = Character.toUpperCase(s.charAt(0));
            s = c + s.substring(1, s.length());
        }
        if(ok && !lower){
            s=s.toLowerCase();
        }

        System.out.println(s);
    }

}
