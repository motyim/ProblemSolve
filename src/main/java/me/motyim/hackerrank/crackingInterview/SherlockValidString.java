package me.motyim.hackerrank.crackingInterview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
public class SherlockValidString {

    public static String isValid(String s) {
        if(s.length() == 1 ) return "YES";

        int max = 1 ;

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            int value = 1;
            if(map.containsKey(c)){
                value = map.get(c)+1;
            }
            map.put(c,value);
            max = Math.max(max,value);
        }

        Collection<Integer> values = map.values();


        return "NO";
    }
}
