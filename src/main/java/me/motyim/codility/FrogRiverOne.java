package me.motyim.codility;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * https://codility.com/demo/results/trainingRKK8ZN-YJG/
 * Created by MotYim on 16-Oct-17.
 */
public class FrogRiverOne {

    public int solution(int X, int A[]){

        //map < int postion , int min sec appear >
        Map<Integer , Integer> map  = new HashMap<Integer, Integer>();
        int time = -1 ;
        for (int i = 0; i < A.length; i++) {
            //check if it in map
            if(map.get(A[i]) != null){
                continue;
            }
            map.put(A[i] , i);
        }


        for (int i = 1; i <= X; i++) {
            Integer t = map.get(i);
            if( t == null)  return -1;
            if(t > time) time = t;
        }

        return time ;
    }

    public static int solution2(int X, int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> fallen = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X)
                fallen.add(A[i]);

            if (fallen.size() == X)
                return i;
        }

        return -1;
    }
}
