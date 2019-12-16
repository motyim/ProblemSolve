package me.motyim.hackerrank.algorithm.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayManipulationTest {

    @Test
    public void testCase0() {
        int n = 5;
        int[][] a = {{1, 2, 100},
                {2, 5, 100},
                {3, 4, 100}};
        assertEquals(200, ArrayManipulation.arrayManipulationPrefixSum2(n, a));
    }

    @Test
    public void testCase1() {
        int n = 4;
        int[][] a = {{2, 3, 603}, {1, 1, 286}, {4, 4, 882}};
        assertEquals(882, ArrayManipulation.arrayManipulationPrefixSum2(n, a));
    }
}