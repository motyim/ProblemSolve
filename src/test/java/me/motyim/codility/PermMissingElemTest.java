package me.motyim.codility;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MY-PC on 13-Oct-17.
 */
public class PermMissingElemTest {
    @Test
    public void testCase(){
        assertEquals(4, new PermMissingElem().solution(new int [] {2,3,1,5}));
    }

}