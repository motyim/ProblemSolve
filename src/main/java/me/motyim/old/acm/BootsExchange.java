package me.motyim.old.acm;

import java.util.Arrays;

public class BootsExchange {

    public static void main(String[] args) {
        int[] l = {1, 3, 1};
        int[] r = {2, 1, 3};
        System.out.println(leastAmount(l, r));
    }

    public static int leastAmount(int[] left, int[] right) {
        Arrays.sort(left);
        Arrays.sort(right);
        int change = 0;
        int start = 0;

        for (int i = 0; i < left.length; i++) {
            boolean ch = true;
            for (int j = start; j < right.length; j++) {
               // System.out.println(left[i] + "  " + right[j]);
                if (left[i] == right[j]) {
                    //System.out.println("false");
                    start = j+1;
                    ch = false;
                    break;
                }
            }
            if (ch) {
                change++;
            }

        }
        return change;
    }

}
