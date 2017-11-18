package me.motyim.hackerrank.crackingInterview;

import java.util.Scanner;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 04-Nov-17
 * link : https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 * @see : https://stackoverflow.com/questions/5385024/mod-in-java-produces-negative-numbers
 */
public class LeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int [] output = new int [n];

        //reduce Rotation
        k %= n ;
        int idx ;
        for (int i = 0; i < n; i++) {
            idx = (i-k);
            //to handle -ve in mod
            idx = (((idx % n) + n) % n);
            output[idx] = a[i];
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output ;
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
