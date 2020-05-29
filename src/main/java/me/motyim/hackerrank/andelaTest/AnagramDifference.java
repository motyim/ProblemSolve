package me.motyim.hackerrank.andelaTest;

import java.util.*;

public class AnagramDifference {


    public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {
        List<Integer> res = new ArrayList();
        for(int i = 0 ; i < a.size(); i++){
            String first = a.get(i);
            String second = b.get(i);
            if(first.length() != second.length()){
                res.add(-1);
                continue;
            }
            res.add(numberNeeded(first,second));
        }
        return res;
    }

    public static int numberNeeded(String first, String second) {

        Map<Character, Integer> map = new HashMap<>();
        int count = 0 ;

        for (int i = 0; i < first.length(); i++) {
            char key = first.charAt(i);
            int value = map.getOrDefault(key,0)+1;
            map.put(key,value);
        }

        for (int i = 0; i < second.length(); i++) {
            char key = second.charAt(i);
            if(map.containsKey(key) && map.get(key) > 0){
                map.put(key,map.get(key)-1);
            }else{
                count++;
            }
        }
        return count;
    }
}
