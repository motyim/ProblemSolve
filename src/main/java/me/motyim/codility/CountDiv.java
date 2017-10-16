package me.motyim.codility;

/**
 * https://codility.com/demo/results/training6XVTNP-S3R/
 * Explanation :
 * Number of integer in the rage [1 .. X] that divisible by K is X/K.
 * So, within the range [A .. B], the result is B/K - (A - 1)/K
 * And (A%K) == 0 if A to include A
 * Created by MotYim on 16-Oct-17.
 */
public class CountDiv {

    public int solution(int A, int B, int K) {
        return B/K - A/K + (A%K == 0 ? 1 : 0 );
    }

}
