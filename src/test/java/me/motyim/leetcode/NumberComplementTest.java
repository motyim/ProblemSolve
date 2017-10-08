package me.motyim.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MotYim on 08-Oct-17.
 */
public class NumberComplementTest {

    @Test
    public void findComplentSimple1() throws Exception {
        assertEquals(2 , new NumberComplement().findComplement(5));
    }

    @Test
    public void findComplentSimple2() throws Exception {
        assertEquals(0 , new NumberComplement().findComplement(1));
    }


}