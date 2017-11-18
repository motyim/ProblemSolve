//http://codeforces.com/problemset/problem/160/A
package me.motyim.old.acm;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int min = 0, sumYou = 0, sumBro = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
            sumBro += a[i];
        }
        Arrays.sort(a);
        for (int i = a.length - 1; i >= 0; i--) {
            min++;
            sumYou += a[i];
            sumBro -= a[i];
            if (sumYou > sumBro) {
                System.out.println(min);
                System.exit(0);
            }
        }
    }

}
