package me.motyim.hackerrank.crackingInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 11-Mar-18
 * link https://www.hackerrank.com/challenges/ctci-ransom-note/problem
 */
public class RansomNote {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        boolean matched = true;

        Map<String,Integer> magazen = new HashMap<>();
        Map<String,Integer> note = new HashMap<>();

        for (int i = 0; i < m; i++) {
            putOnMap(magazen,in.next());
        }

        for (int i = 0; i < n; i++) {
            putOnMap(note,in.next());
        }


        for (String string : note.keySet()) {
            if(note.get(string) > magazen.get(string)){
                matched = false;
                break;
            }
        }

        if(matched){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static void putOnMap(Map<String, Integer> map, String str) {
        if(map.containsKey(str)){
            map.get(str);
            map.put(str,map.get(str)+1);
        }else{
            map.put(str,1);
        }
    }
}
