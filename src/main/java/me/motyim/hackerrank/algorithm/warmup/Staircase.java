package me.motyim.hackerrank.algorithm.warmup;

import java.util.Scanner;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 18-Nov-17
 */
public class Staircase {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        for(int i=0 ; i<n ;i++){
            for(int j = 0; j <= n-i-2; j++){
                System.out.print(" ");
            }
            for(int j = n-i-1 ; j< n; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        
        in.close();
    }
}
