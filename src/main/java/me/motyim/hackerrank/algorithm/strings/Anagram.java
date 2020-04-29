package me.motyim.hackerrank.algorithm.strings;

import java.util.HashMap;
import java.util.Map;
//https://www.hackerrank.com/challenges/anagram/problem
public class Anagram {

    static int anagram(String s) {
        if(s.length() % 2 != 0 ) return -1 ;

        int size = s.length() / 2 ;

        String firstString  = s.substring(0,size);
        String secondString = s.substring(size);

        Map<Character,Integer> fm = new HashMap<>();
        for(int i = 0 ; i < size ; i++){
            int value = 1 ;
            char c = firstString.charAt(i);
            if(fm.containsKey(c)){
                value = fm.get(c)+1;
            }
            fm.put(c,value);
        }

        int diff = size ;
        for(int i = 0 ; i < size ; i++){
            char c = secondString.charAt(i);
            if(fm.containsKey(c) && fm.get(c) != 0){
                diff--;
                fm.put(c,fm.get(c)-1);
            }
        }

        return diff;
    }
}
