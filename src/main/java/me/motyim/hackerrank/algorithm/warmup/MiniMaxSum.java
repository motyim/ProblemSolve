package me.motyim.hackerrank.algorithm.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 18-Nov-17
 */
public class MiniMaxSum {
    public static void main(String[] args) {
        final int SIZE = 5 ;

        Scanner in = new Scanner(System.in);
        int[] arr = new int[SIZE];
        for(int arr_i=0; arr_i < SIZE; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        long count = Arrays.stream(arr).asLongStream().sum();
        long max = count - Arrays.stream(arr).min().getAsInt();
        long min = count - Arrays.stream(arr).max().getAsInt();

        System.out.println(min + " " +max);
    }
}
