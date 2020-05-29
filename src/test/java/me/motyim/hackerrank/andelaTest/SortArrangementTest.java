package me.motyim.hackerrank.andelaTest;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SortArrangementTest {

    @Test
    public void testCase0() {
        List<Integer> list = Arrays.asList(2, 5, 6, 10, 3);
        assertEquals(7, SortArrangement.minimumOperations(list));
    }

    @Test
    public void testCase1() {
        List<Integer> list = Arrays.asList(10, 6, 2, 3, 7, 1, 2);
        assertEquals(13, SortArrangement.minimumOperations(list));
    }

    @Test
    public void testCasePre0() {
//        long xx = SortArrangement.binarySearch(Arrays.asList(1, 2, 3, 5, 6), 4);
//        System.out.println(xx);
    }

    @Test
    public void testCase2(){
        List<Integer> list = Arrays.asList(2,
                19,
                10,
                1,
                6,
                13,
                6,
                6,
                15,
                12);
        assertEquals(34, SortArrangement.minimumOperations(list));
    }

    @Test
    public void testCase3() {
        List<Integer> list = Arrays.asList(9,
                8,
                4,
                9,
                28,
                21,
                24,
                18,
                29,
                25,
                9,
                3,
                19, 5,
                3);
        assertEquals(47, SortArrangement.minimumOperations(list));
    }

}