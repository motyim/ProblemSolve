package me.motyim.codility.lesson3;

import me.motyim.codility.lesson3.TapeEquilibrium;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MotYim on 13-Oct-17.
 */
public class TapeEquilibriumTest {

    @Test
    public void testCase1(){
        assertEquals(1, new TapeEquilibrium().solution(new int[] {3,1,2,4,3}));
    }
}