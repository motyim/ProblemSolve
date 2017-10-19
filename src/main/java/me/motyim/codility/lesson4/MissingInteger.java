package me.motyim.codility.lesson4;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codility.com/demo/results/demo435622-ZW3/
 * Created by MotYim on 11-Oct-17.
 */

public class MissingInteger {

    public int solution(int[] A) {
        Map<Integer , Integer> m = new HashMap<Integer, Integer>();

        boolean allNegtive = true ;
        for (int i = 0; i <A.length ; i++) {
            if(A[i] >  0) allNegtive = false ;
            m.put(A[i],0);
        }

        if(allNegtive) return 1 ;
        int i = 1 ;
        while(true){
            if(m.containsKey(i)){
                i++;
            }
            else return i ;
        }
    }
}
