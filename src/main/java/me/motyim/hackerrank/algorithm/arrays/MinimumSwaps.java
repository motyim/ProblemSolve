package me.motyim.hackerrank.algorithm.arrays;

public class MinimumSwaps {
    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int minimumSwaps = 0;
        for (int i = 0; i < arr.length;) {
            if(arr[i]==i+1){
                i++;
                continue;
            }
            int idx = arr[i];
            arr[i]=arr[idx-1];
            arr[idx-1] = idx;
            minimumSwaps++;
        }
        return minimumSwaps;
    }

}
