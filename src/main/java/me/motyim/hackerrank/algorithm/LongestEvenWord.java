package me.motyim.hackerrank.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestEvenWord {

    public static String longestEvenWord(String sentence) {
        String[] strings = sentence.split("\\s+");
        List<String> evenStrings = Arrays.asList(strings).stream().filter(s -> s.length() % 2 == 0).collect(Collectors.toList());
        String longest = "";
        for (String string : evenStrings) {
            if(string.length() > longest.length())
                longest = string;
        }
        return longest.equals("")?"00":longest;
    }



}
