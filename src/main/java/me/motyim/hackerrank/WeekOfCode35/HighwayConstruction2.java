package me.motyim.hackerrank.WeekOfCode35;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Math.toIntExact;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 17-Nov-17
 * result Runtime Error
 */
public class HighwayConstruction2 {
    private final static int PRIME = 1000000009;
//    private static int table [][] = new int[1000][1000];

    private static Map<Node , Long> binomialTable = new HashMap<>();


    static int highwayConstruction(long n, int p) {
        // Complete this function
        n = n-1 ;
        int result = 0 ;

        for (int i = 1; i <= p ; i++) {
            for (int j = 0; j <= i-1 ; j++) {
                long t1 = ((long) Math.pow(i-j , p)) % PRIME ;
                long t2 = ((long) binomialCoeff(n + p - i + 1, n - i)) % PRIME;
                long t3 = ((long)binomialCoeff(p+1,j) ) % PRIME;
                result += (( Math.pow(-1 , j) * t1 * t2 * t3 ) % PRIME);
            }
        }

        return result-1;

    }


    static int binomialCoeff(long n, long k)
    {
        n = n%PRIME;
        int i, j;

        // Calculate  value of Binomial Coefficient in bottom up manner
        for (i = 0; i <= n; i++)
        {
            for (j = 0; j <= Math.min(i, k); j++)
            {
                // Base Cases
                if (j == 0 || j == i){
                    binomialTable.put(new Node(i,j),1L);
                }

                // Calculate value using previosly stored values
                else{
                    long l = binomialTable.get(new Node(i - 1, j - 1)) + binomialTable.get(new Node(i - 1, j));
                    binomialTable.put(new Node(i,j),l%PRIME);
                }

            }
        }
        return toIntExact(binomialTable.get(new Node((int)n,(int)k))) ;
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

    private static class Node implements Comparable<Node>{
        int n ;
        int k ;

        public Node(int n, int k) {
            this.n = n;
            this.k = k;
        }

        @Override
        public int compareTo(Node o) {
            if(n==o.n && k==o.k) return 0 ;
            else if( n > o.n) return 1 ;
            else return -1 ;
        }

        @Override
        public boolean equals(Object obj) {
            Node o = (Node) obj;
            return (n==o.n && k==o.k);
        }

        @Override
        public int hashCode() {
            return n;
        }
    }
}


