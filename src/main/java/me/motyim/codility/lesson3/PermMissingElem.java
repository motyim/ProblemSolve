package me.motyim.codility.lesson3;

/**
 * https://codility.com/demo/results/training9PWG3T-RBC/
 * https://codility.com/demo/results/trainingRKTYW6-KUK/
 * Created by MotYim on 13-Oct-17.
 */
public class PermMissingElem {

    public int solution(int[] A) {
        //make sure all vars are long to avoid overflow
        // see two link above to see difference
        long N = A.length+1 ;
        long sum = (N * (N+1)) / 2 ;

        for (int i = 0; i < A.length; i++) {
            sum -= A[i];
        }
        return (int)sum;
    }

}
