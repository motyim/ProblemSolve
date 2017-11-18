package me.motyim.hackerrank.WeekOfCode35;

import java.util.Scanner;



/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 15-Nov-17
 */
public class TripleRecursion {

    static void tripleRecursion(int n, int m, int k) {

        int [][] a = new int [n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if( i == 0 && j == 0) a[i][j] = m;

                else if (i == j) a[i][j] = a[i-1][j-1] + k;

                else if(i > j ) a[i][j] = a[i-1][j]-1;

                else a[i][j] = a[i][j-1] -1 ;

            }
        }

        printArray(a);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        tripleRecursion(n, m, k);
        in.close();
    }

    public static void printArray(int [] [] a ){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println();
        }
    }


}
