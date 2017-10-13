package me.motyim.codility;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 *
 * Created by MotYim on 13-Oct-17.
 */
public class OddOccurrencesInArray {

    public static int solution3(int[] A) {
        int elem = 0;

        for (int i = 0; i < A.length; i++) {
            elem ^= A[i];
        }
        return elem;
    }


    public int solution2(int[] A) {
        Set <Integer> set = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            if(set.contains(A[i])){
                set.remove(A[i]);
            }else{
                set.add(A[i]);
            }
        }
        Object[] objects = set.toArray();
        return (Integer) objects[0];

    }

    public int solution(int[] A) {
        int unique = -1 ;
        Map<Integer , Integer > map = new HashMap<Integer, Integer>();

        for (int i = 0; i <A.length; i++) {
            if(map.containsKey(A[i])){
                map.put(A[i] ,map.get(A[i])+1);
            }else map.put(A[i], 1);
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entrie: entries) {
            if(entrie.getValue() == 1)
                return entrie.getKey();
        }
        return unique;
    }
}
