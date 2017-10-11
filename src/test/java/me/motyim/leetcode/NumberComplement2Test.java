package me.motyim.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MotYim on 09-Oct-17.
 */
public class NumberComplement2Test {

    @Test
    public void findComplentSimple1() throws Exception {
        assertEquals(2 , new NumberComplement2().findComplement(5));
    }

    @Test
    public void findComplentSimple2() throws Exception {
        assertEquals(0 , new NumberComplement2().findComplement(1));
    }

}