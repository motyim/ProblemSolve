package me.motyim.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * https://codility.com/demo/results/trainingMP3E67-H87/
 * https://codility.com/demo/results/trainingHQKEVX-4VK/
 * Created by MotYim on 14-Oct-17.
 */
public class PermCheck {

    public int solution(int[] A) {
        long N = A.length;
        long sum = N * (N+1) / 2 ;


        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            sum -=A[i];
            set.add(A[i]);
        }
        if(set.size() != A.length) return 0 ;

        return (sum ==0 ) ? 1 : 0 ;
    }
}
