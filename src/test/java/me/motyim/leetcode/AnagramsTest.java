package me.motyim.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AnagramsTest {
    @Test
    public void testsortString(){
        Anagrams angeram = new Anagrams();
        String string = angeram.sortString("CBA");
        assertEquals("ABC",string);
    }


    @Test
    public void test(){
        Anagrams angeram = new Anagrams();
        String str[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = angeram.groupAnagrams(str);
        for (List<String> list : lists) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}