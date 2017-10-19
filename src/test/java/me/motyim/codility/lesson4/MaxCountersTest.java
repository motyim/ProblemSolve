package me.motyim.codility.lesson4;

import me.motyim.codility.lesson4.MaxCounters;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MY-PC on 16-Oct-17.
 */
public class MaxCountersTest {

    @Test
    public void testCase1(){
        assertArrayEquals(new int [] {3, 2, 2, 4, 2} , new MaxCounters().solution2(5,new int [] {3,4,4,6,1,4,4}));
    }

}