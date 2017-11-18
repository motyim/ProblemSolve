//http://codeforces.com/problemset/problem/34/B
package me.motyim.old.acm;

import java.util.Arrays;
import java.util.Scanner;

public class Sale {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] tv = new int[n];
        int earn = 0;
        for (int i = 0; i < tv.length; i++) {
            tv[i] = in.nextInt();
        }
        Arrays.sort(tv);
        for (int i = 0; i < m; i++) {
            if (tv[i] < 0) {
                earn += tv[i];
            }
        }
        earn = Math.abs(earn);
        System.out.println(earn);
    }

}
