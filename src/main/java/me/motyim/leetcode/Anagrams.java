package me.motyim.leetcode;

import java.util.*;

//https://leetcode.com/problems/group-anagrams/
public class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sorted = strs.clone();
        Map<String,List<String>> map = new HashMap<>();

        for (int i = 0; i < sorted.length; i++) {
            String s = sorted[i];
            s = sortString(s);
            List<String> array;
            if (!map.containsKey(s)) {
                array = new ArrayList<>();
            }else{
                array = map.get(s);
            }
            array.add(strs[i]);
            map.put(s, array);
        }

        List<List<String>> output = new ArrayList<>();
        for (String s : map.keySet()) {
            output.add(map.get(s));
        }

        return output;
    }

    public String sortString(String str){
        byte[] stringChars = str.getBytes();
        Arrays.sort(stringChars);
        return new String(stringChars);
    }
}
