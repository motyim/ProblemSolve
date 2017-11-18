package me.motyim.hackerrank.crackingInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 04-Nov-17
 * Link : https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
 */
public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        int diff = 0;
        Map <Character , Integer> firstMap = addToMap(first);
        Map <Character , Integer> secondMap = addToMap(second);

        diff += getDiff(firstMap, secondMap , false);
        diff += getDiff(secondMap, firstMap , true);

        return diff ;
    }

    /**
     *
     * @param firstMap
     * @param secondMap
     * @param flag flag to not cal for second time in diff
     * @return
     */
    private static int getDiff(Map<Character, Integer> firstMap, Map<Character, Integer> secondMap,boolean flag) {
        int diff = 0;
        for (Map.Entry<Character, Integer> entry : firstMap.entrySet()){
            if(secondMap.get(entry.getKey()) != null){
                if(flag) continue;
                diff += Math.abs( secondMap.get(entry.getKey()) - entry.getValue());
            }else{
                diff += entry.getValue();
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

    private static Map addToMap(String string){
        Map<Character , Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if(map.containsKey(string.charAt(i))){
                map.put(string.charAt(i),map.get(string.charAt(i))+1);
            }else map.put(string.charAt(i),1);
        }
        return map;
    }
}
