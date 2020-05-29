package me.motyim.hackerrank.andelaTest;

import java.util.*;

public class SortArrangement {

    public static long minimumOperations(List<Integer> numbers) {

        LinkedList<Integer> list = new LinkedList<>();
        long operation = 0;

        for (Integer number : numbers) {

            if (list.isEmpty()) {
                list.add(number);
                operation++;
            }else if(number <= list.getFirst()){
                list.addFirst(number);
                operation++;
            }else if(number>= list.getLast()){
                list.addLast(number);
                operation++;
            }
            else {
                int index = binarySearch(list, number);
                if(list.get(index)<number) index++;
                int res = (int)Math.min(index, list.size()-index);
                res = res == 0 ? 1 : res;
                operation += (res * 2) + 1;
                list.add(number);
                Collections.sort(list);
            }
        }

        return operation;
    }

    public static int binarySearch(LinkedList<Integer> list,int number) {

        int left = 0;
        int right = list.size()-1;

        int lastInd = 0;

        while(left<=right){
            int idx =left + (right - left) / 2;
            if(list.get(idx)==number) return idx-1;
            else if (list.get(idx) > number){
                right = idx-1;
                lastInd = idx-1;
            }else{
                left = idx+1;
                lastInd = idx+1;
            }

        }
        if (lastInd <= 0 ) return 1;
        return lastInd;
    }
}
