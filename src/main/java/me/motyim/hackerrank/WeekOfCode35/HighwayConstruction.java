package me.motyim.hackerrank.WeekOfCode35;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 17-Nov-17
 * result TimeOut
 */
public class HighwayConstruction {
    private final static int PRIME = 1000000009;
    private static Map<Long , Long> temp = new TreeMap<>();

    static int highwayConstruction(long n, int p) {
        // Complete this function
        n = n-1 ;
        int result = 0 ;

        for (int i = 1; i <= p ; i++) {
            for (int j = 0; j <= i-1 ; j++) {
                long t1 = ((long) Math.pow(i-j , p)) % PRIME ;
                long t2 = ((long) binomialCoefficient(n + p - i + 1, n - i)) % PRIME;
                long t3 = ((long)binomialCoefficient(p+1,j) ) % PRIME;
                result += (( Math.pow(-1 , j) * t1 * t2 * t3 ) % PRIME);
            }
        }

        return result-1;

    }

    private static double binomialCoefficient(long n, long k) {

        if( k < 0 ) return 0 ;
        n=n%PRIME ;
        return (fact(n)%PRIME) / ((fact((n-k))%PRIME) * (fact(k)%PRIME));
    }

    private static long fact(long aa) {

        long a = aa % PRIME ;
        if ( new Long(a).equals(0L)||new Long(a).equals(1L) ){
            return 1L;
        } else {
            if (temp.get(a) != null )
                return temp.get(a);
            else{
                long l = ((a %PRIME )* (fact(a - 1)%PRIME) %PRIME);
                temp.put(a,l);
                return  l ;
            }

        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long n = in.nextLong();
            int k = in.nextInt();
            int result = highwayConstruction(n, k);
            System.out.println(result);
        }
        in.close();
    }
}
