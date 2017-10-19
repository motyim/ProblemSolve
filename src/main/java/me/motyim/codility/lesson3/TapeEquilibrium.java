package me.motyim.codility.lesson3;

/**
 * https://codility.com/demo/results/training7YYW5U-V7N/
 * Created by MotYim on 13-Oct-17.
 */
public class TapeEquilibrium {

    public int solution(int[] A) {
        int min  , left , right = 0;

        left = A[0];

        for (int i = 1; i < A.length; i++) {
            right += A[i];
        }
        min = Integer.MAX_VALUE ;
        //compare points
        for (int i = 1; i <A.length ; i++) {
            if(Math.abs(left - right) < min)
                min = Math.abs(left - right);
            left += A[i];
            right -=A[i];
        }
       return min ;
    }
}
