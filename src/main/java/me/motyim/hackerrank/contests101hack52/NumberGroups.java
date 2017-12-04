package me.motyim.hackerrank.contests101hack52;

import java.util.Scanner;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 04-Dec-17
 */
public class NumberGroups {
    static long sumOfGroup(int k) {
        long res = 0 ;
        long startIdx   = getIndex(k);
        long startNum  = getOddNumber(startIdx);

        for (int i = 0; i < k; i++) {
            res += startNum;
            startNum +=2;
        }

        return res;
    }

    private static long getOddNumber(long idx) {
        return 2 * idx + 1;
    }

    private static long getIndex(int k) {
        return ((long)k * (k-1) ) / 2;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        long answer = sumOfGroup(k);
        System.out.println(answer);
        in.close();
    }
}
