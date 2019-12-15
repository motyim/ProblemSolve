package me.motyim.hackerrank.algorithm.arrays;

public class ArrayManipulation {
    // Complete the arrayManipulation function below.
    public static long arrayManipulation(int n, int[][] queries) {
        long max = 0 ;
        long [] array = new long[n];

        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]-1; j < queries[i][1]; j++) {
                array[j] += queries[i][2];
                if(array[j]> max) max = array[j];
            }
        }
        return max;
    }
}
