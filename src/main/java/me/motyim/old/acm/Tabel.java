//http://codeforces.com/problemset/problem/359/A
package me.motyim.old.acm;

import java.util.Scanner;

public class Tabel {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        boolean atEdge = false;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int a = in.nextInt();
                if (a == 1) {
                    if (i == 0) {
                        atEdge = true;
                    }
                    if (i == h - 1) {
                        atEdge = true;
                    }
                    if (j == 0) {
                        atEdge = true;
                    }
                    if (j == w - 1) {
                        atEdge = true;
                    }
                }
            }
        }
        if (atEdge) {
            System.out.println(2);
        } else {
            System.out.println(4);
        }
    }
}
