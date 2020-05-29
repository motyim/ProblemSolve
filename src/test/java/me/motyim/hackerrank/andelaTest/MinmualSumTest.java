package me.motyim.hackerrank.andelaTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MinmualSumTest {

    @Test
    public void testCase3(){

        int [] arr = new int [100];
        Arrays.fill(arr,1);
        List list = new ArrayList<String>(100);
        for (int i = 0; i < 100; i++) {
            list.add(arr[i]);
        }
        assertEquals(100,MinmualSum.minSum(list,500));
    }

}