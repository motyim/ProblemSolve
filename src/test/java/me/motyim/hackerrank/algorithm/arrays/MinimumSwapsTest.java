package me.motyim.hackerrank.algorithm.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSwapsTest {

    @Test
    public void testCase(){
        int [] arr = {7, 1, 3, 2, 4, 5, 6};
        assertEquals(5,MinimumSwaps.minimumSwaps(arr));
    }

    @Test
    public void testCase0(){
        int [] arr = {4 ,3, 1, 2};
        assertEquals(3,MinimumSwaps.minimumSwaps(arr));
    }

    @Test
    public void testCase1(){
        int [] arr = {2, 3, 4, 1, 5};
        assertEquals(3,MinimumSwaps.minimumSwaps(arr));
    }
    @Test
    public void testCase2(){
        int [] arr = {1, 3, 5, 2, 4, 6, 7};
        assertEquals(3,MinimumSwaps.minimumSwaps(arr));
    }

}