package me.motyim.codility;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MY-PC on 16-Oct-17.
 */
public class FrogRiverOneTest {

    @Test
    public void testCase1(){
        int [] a = {1,3,1,4,2,3,5,4};
        assertEquals(6 , new FrogRiverOne().solution(5,a));
    }

}