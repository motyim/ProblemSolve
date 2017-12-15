package me.motyim.hackerrank.worldcodesprint12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 14-Dec-17
 * link : https://www.hackerrank.com/contests/world-codesprint-12/challenges/breaking-sticks
 */
public class BreakingSticks {

    static HashMap<Long , Long> d = new HashMap<>();
    static long longestSequence(long[] a) {
        //  Return the length of the longest possible sequence of moves.
        long sum = 0 ;

        for (int i = 0; i < a.length; i++) {
            sum +=calc(a[i]);
        }

        return sum;
    }

    private static long calc(long a) {
        if( a ==1L ) return  1 ;
        if(d.get(a)==null){
            Long maxPrime = prime_factors(a).stream().max(Long::compareTo).get();
            long remain = a / maxPrime;
            long res = maxPrime * calc(remain) + 1;
            d.put(a,res);
        }
        return d.get(a);

    }

    public static ArrayList<Long> prime_factors(long n){
        ArrayList<Long>factors = new ArrayList<>();
        long d = 2 ;
        while (n>1){
            while (n % d == 0){
                factors.add(d);
                n /= d;
            }

            d = d + 1;
            if (d*d > n){
                if (n > 1) factors.add(n);
                break;
            }
        }
        return factors;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextLong();
        }
        long result = longestSequence(a);
        System.out.println(result);
        in.close();
    }
}
