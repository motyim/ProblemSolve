package me.motyim.hackerrank.algorithm.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 18-Nov-17
 */
public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int n, int[] ar) {

        // Complete this function
        int maxHeight = Arrays.stream(ar).max().getAsInt();
        return ((int) Arrays.stream(ar).filter(i -> i == maxHeight).count());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
