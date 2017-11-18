package me.motyim.hackerrank.crackingInterview;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 04-Nov-17
 * Link : https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
 */
public class MakingAnagrams2 {
    public static int numberNeeded(String first, String second) {

        final int [] letter = new int [26];
        first.chars().forEach( c -> {letter[c-'a']++;});
        second.chars().forEach( c -> {letter[c-'a']--;});

        return IntStream.of(letter).map(i -> Math.abs(i)).sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
