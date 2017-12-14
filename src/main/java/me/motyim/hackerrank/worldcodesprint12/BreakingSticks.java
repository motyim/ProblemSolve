package me.motyim.hackerrank.worldcodesprint12;

import java.util.ArrayList;
import java.util.Collections;
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
            if( a % 2 == 0){
                long divisor = divisor(a);
                long remain = (a/divisor);
                long sub =calc(Math.max(divisor,remain));
                d.put(a,(Math.min(remain,divisor)*sub)+1);
            }else if(isPrime(a)){
                d.put(a,a+1);
            }else{
                ArrayList<Long> longs = allFactors(a);

            }
        }
        return d.get(a);

    }

    public static ArrayList<Long> allFactors(long a) {

        long upperlimit = (long)(Math.sqrt(a));
        ArrayList<Long> factors = new ArrayList<>();
        for(long i=1;i <= upperlimit; i+= 1){
            if(a%i == 0){
                factors.add(i);
                if(i != a/i){
                    factors.add(a/i);
                }
            }
        }
        Collections.sort(factors);
        return factors;
    }

    private static boolean isPrime(long n) {
        if(n == 2) return true;
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(long i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    private static long divisor(long number)
    {
        long i;
        for (i =(long) Math.sqrt(number) ; i>2; i--)
        {
            if(i%2==0) continue;
            if (number % i == 0)
            {
                break;
            }
        }
        return number/i;
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
