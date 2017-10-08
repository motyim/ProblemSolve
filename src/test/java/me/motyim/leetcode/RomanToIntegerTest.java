package me.motyim.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MY-PC on 07-Oct-17.
 */
public class RomanToIntegerTest {
    @Test
    public void romanToIntSimple1() throws Exception {
        assertEquals(1 , new RomanToInteger().romanToInt("I"));
    }

    @Test
    public void romanToIntSimple2() throws Exception {
        assertEquals(5 , new RomanToInteger().romanToInt("V"));
    }


    @Test
    public void romanToIntSimple3() throws Exception {
        assertEquals(8 , new RomanToInteger().romanToInt("VIII"));
    }

    @Test
    public void romanToIntSimple4() throws Exception {
        assertEquals(38 , new RomanToInteger().romanToInt("XXXVIII"));
    }

    @Test
    public void romanToIntSimple5() throws Exception {
        assertEquals(54 , new RomanToInteger().romanToInt("LIV"));
    }



}