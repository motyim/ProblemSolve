package me.motyim.hackerrank.crackingInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {

    public static int sherlockAndAnagrams(String s) {

        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length()+1; j++) {
                char[] chars = s.substring(i, j).toCharArray();
                Arrays.sort(chars);
                String str = new String(chars);
                if(map.containsKey(str))
                    map.put(str,map.get(str)+1);
                else map.put(str,1);
            }
        }
        int count = 0 ;
        for(String key: map.keySet()){
            int n  = map.get(key);
            count+= (n * (n-1))/2;
        }
        return count ;
    }
}
