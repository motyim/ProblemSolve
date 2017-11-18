//http://codeforces.com/problemset/problem/315/A
package me.motyim.old.acm;

import java.util.Scanner;

public class SerejaAndBottles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int open = n;
        for (int i = 0; i < b.length; i++) {
            a[i]=in.nextInt();
            b[i]=in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && i != j) {
                    open--;
                    break;
                }

            }

        }
        System.out.println(open);

    }
}
