package me.motyim.codility;

/**
 * https://codility.com/demo/results/trainingK2ZWWA-NS5/
 * Created by MotYim on 16-Oct-17.
 */
public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int [] result = new int [N];
        int max = 0 ;

        for (int i = 0; i <A.length ; i++) {
            if(A[i] > 0 && A[i] <=N){
                result[A[i]-1]++;
                if(result[A[i]-1] > max) max = result[A[i]-1];
            }

            if(A[i] == N + 1) setMax(result , max);

        }
        return result ;
    }

    private void setMax(int[] result, int max) {
        for (int i = 0; i < result.length; i++) {
            result[i] = max ;
        }
    }

    //--------------------------------------------------
    public int[] solution2(int N, int[] A) {
        int [] result = new int [N];
        int max = 0 ;
        int bigMax = 0 ;

        for (int i = 0; i <A.length ; i++) {
            if(A[i] > 0 && A[i] <=N){
                result[A[i]-1] = Math.max(result[A[i]-1] , bigMax);
                result[A[i]-1]++;
                max = Math.max(result[A[i]-1] , max);
            }

            if(A[i] == N + 1) bigMax = max ;

        }

        for (int i = 0; i < result.length; i++) {
            result[i] = Math.max(result[i] , bigMax);
        }
        return result ;
    }
}
