package me.motyim.hackerrank.worldcodesprint12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 14-Dec-17
 * link : https://www.hackerrank.com/contests/world-codesprint-12/challenges/factorial-array
 * result : TimeOut & Correct
 */
public class FactorialArray {
    static int[] A ;
    static Map <Integer , Long> factoral = new HashMap<>();
    static long MAX = (long) 10e8;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        for(int i = 0; i < m; i++){
            int operation = in.nextInt();
            int start = in.nextInt();
            int end = in.nextInt();

            switch (operation){
                case 1 :
                    increas(start-1,end);
                    break;
                case 2 :
                    fact(start-1,end);
                    break;
                case 3 :
                    set(start-1,end);
                    break;
            }
        }
        in.close();
    }

    private static void set(int idx, int value) {
        A[idx]=value;
    }

    private static void increas(int start, int end) {
        for (int i = start; i < end; i++) {
            A[i]++;
        }
    }

    private static void fact(int start, int end) {
        long fact  = 0 ;
        for (int i = start; i < end; i++) {
            fact = ((fact +fact(A[i]))%MAX);
        }
        System.out.println(fact);
    }

    private static long fact(int aa) {

        if (aa == 0 || aa == 1) {
            return 1L;
        } else {
            if (factoral.get(aa)==null){
                long temp = fact(aa - 1) %MAX;
                long temp2= aa%MAX;
                temp = (temp*temp2)%MAX;
                factoral.put(aa ,temp );

            }


            return factoral.get(aa);
        }

    }


}
