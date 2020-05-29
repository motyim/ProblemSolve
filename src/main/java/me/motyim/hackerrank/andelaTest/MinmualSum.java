package me.motyim.hackerrank.andelaTest;

import java.util.*;

public class MinmualSum {

    public static int minSum(List<Integer> num, int k) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int number :num){
            queue.add(number);
        }

        while(k-- > 0){
            int number = queue.poll();
            number = (int)Math.ceil(number/2.0);
            queue.add(number);
        }
        int sum = 0 ;
        while(!queue.isEmpty()){
            sum += queue.poll();
        }
        return sum ;
    }
}
