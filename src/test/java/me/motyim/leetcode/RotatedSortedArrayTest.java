package me.motyim.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RotatedSortedArrayTest {

    private static  RotatedSortedArray object;

    @BeforeClass
    public static void setup(){
        object = new RotatedSortedArray();
    }

    @Test
    public void testCase0(){
        int result = object.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        assertEquals(4,result);
    }

    @Test
    public void testCase1(){
        int result = object.search(new int[]{4,5,6,7,0,1,2}, 3);
        assertEquals(-1,result);
    }

    @Test
    public void testCase2(){
        int result = object.search(new int[]{1}, 0);
        assertEquals(-1,result);
    }

    @Test
    public void testCase3(){
        int result = object.search(new int[]{5,1,3}, 5);
        assertEquals(0,result);
    }

    @Test
    public void testCase4(){
        int result = object.search(new int[]{4,5,6,7,8,1,2,3}, 8);
        assertEquals(4,result);
    }
}