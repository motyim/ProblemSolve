package me.motyim.codility.lesson6;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MaxProductOfThreeKtTest {

    @Test
    public void testCase1(){
        assertEquals(60,MaxProductOfThreeKt.maxThree(new int[]{-3, 1, 2, -2, 5, 6}));
    }

    @Test
    public void testCase(){
        assertEquals(3,MaxProductOfThreeKt.maxThree(new int[]{1,1,3}));
    }

    @Test
    public void testCase3(){
        assertEquals(6,MaxProductOfThreeKt.maxThree(new int[]{0,0,0,0,0,0,0,1,2,3}));
    }

    @Test
    public void testCase4(){
        assertEquals(1000000000,MaxProductOfThreeKt.maxThree(new int[]{1000,1000,1000}));
    }





}