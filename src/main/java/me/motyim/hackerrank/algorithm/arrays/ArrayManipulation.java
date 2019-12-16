package me.motyim.hackerrank.algorithm.arrays;

import javafx.util.Pair;

import java.util.*;

public class ArrayManipulation {
    // this function work correctly but get time out
    public static long arrayManipulation(int n, int[][] queries) {
        long max = 0;
        long[] array = new long[n];

        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0] - 1; j < queries[i][1]; j++) {
                array[j] += queries[i][2];
                max = Math.max(max,array[i]);
            }
        }
        return max;
    }

    // using prefix sum algorithm o(n)
    public static long arrayManipulationPrefixSum(int n, int[][] queries) {
        long max = 0;
        long[] array = new long[n + 1];

        //set up prefix sum range
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0]-1;
            int b = queries[i][1];
            long k = queries[i][2];
            array[a] += k;
            array[b] -= k;
        }

        //call prefix sum and get max
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i - 1];
            max = Math.max(max,array[i]);
        }
        return max;
    }


    // using prefix sum algorithm O(m log m)
    public static long arrayManipulationPrefixSum2(int n, int[][] queries) {
        long max = 0;
        List<Pair<Integer,Long>> list = new ArrayList<>();

        //set up prefix sum range
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            long k = queries[i][2];

            list.add(new Pair<>(a,k));
            list.add(new Pair<>(b+1,-k));
        }

        Collections.sort(list, (left, right) -> {
            if(left.getKey() < right.getKey()) return -1;
            else if (left.getKey() > right.getKey()) return 1;
            else {
                if(left.getValue() < right.getValue()) return -1;
                else if(left.getValue() > right.getValue()) return 1;
                else return 0 ;
            }
        });

        //call prefix sum and get max
        long sum = 0 ;
        for (int i = 0; i < 2*queries.length; i++) {
            sum +=list.get(i).getValue();
            max = Math.max(max,sum);
        }
        return max;
    }
}
