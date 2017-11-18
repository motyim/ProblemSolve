/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.motyim.old.MyOwnSolve;

import java.util.Scanner;

/**
 *
 * @author Mohamed MotYim <mohamed.motyim@gmail.com>
 */
public class nadia {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        String ss = "nadia";
        int i = in.nextInt();
        while (i-- != 0) {
            s = in.next();
            int k = 0;
            boolean t = false;
            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == ss.charAt(k)) {
                    k++;
                    if (k == ss.length()) {
                        System.out.println("YES");
                        t = true;
                        break;
                    }
                }

            }
            if (!t) {
                System.out.println("NO");
            }
        }

    }
}
