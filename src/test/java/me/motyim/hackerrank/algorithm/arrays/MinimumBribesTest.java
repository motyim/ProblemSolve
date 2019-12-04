package me.motyim.hackerrank.algorithm.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumBribesTest {

    @Test
    public void customeTest0(){
        int []  x = {1,2};
        MinimumBribes.minimumBribes(x);
        int []  y = {2,1};
        MinimumBribes.minimumBribes(y);
    }

    @Test
    public void testCase1(){
        int []  x = {2,1,5,3,4};
        MinimumBribes.minimumBribes(x);
        int []  y = {2,5,1,3,4};
        MinimumBribes.minimumBribes(y);
    }

    @Test
    public void testCase2(){
        int []  x = {1 ,2 ,5 ,3 ,7 ,8 ,6 ,4};
        MinimumBribes.minimumBribes(x);
    }

}