package me.motyim.hackerrank.algorithm.dictionaries;

import java.util.*;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Set<Integer> set1 = new HashSet<>();
        s1.chars().forEach(set1::add);

        Set<Integer> set2 = new HashSet<>();
        s2.chars().forEach(set2::add);


        for (Integer integer : set2) {
            if (set1.contains(integer)) {
                return "YES";
            }
        }

        return "NO";
    }
}
